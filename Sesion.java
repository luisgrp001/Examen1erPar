import java.util.Scanner;

public class Sesion {

    public static void main(String[] args) {
        Usuario u = new Usuario(1,"Luis","Rojas","Paredes","Acta","21/08/1999","Calle Hidalgo","09/2027","5512345678","luis@correo.com");
        Banco b = new Banco(1,8000,"12345");
        Contacto c = new Contacto(1,"Pedro Sanchez","9876543210","5545875521");
        enviarDinero(u,b,c);
        
    }
    
    public static void enviarDinero(Usuario u,Banco b,Contacto c){
        System.out.println("USTED ES: "+u.getNombre()+" "+u.getApellidoPaterno()+" "+u.getApellidoMaterno());
        System.out.println("SU SALDO ES DE: "+b.getSaldo()+" MXN");
        double monto;
        Scanner reader = new Scanner(System.in);
        System.out.print("INGRESE EL MONTO A ENVIAR:" );
        monto = reader.nextDouble();
        if(b.getSaldo()>=monto){
            System.out.println("SU SALDO AHORA ES DE: "+(b.getSaldo()-monto));
        }else{
            System.out.println("FONDOS INSUFICIENTES");
        }
        
    }
    
}
