public class Contacto {
    private int idContacto;
    private String nombre;
    private String claveInterb;
    private String telefono;

    public Contacto() {
    }

    public Contacto(int idContacto, String nombre, String claveInterb, String telefono) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.claveInterb = claveInterb;
        this.telefono = telefono;
    }
    
    
    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClaveInterb() {
        return claveInterb;
    }

    public void setClaveInterb(String claveInterb) {
        this.claveInterb = claveInterb;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
