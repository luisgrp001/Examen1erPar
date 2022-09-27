public class Banco {
    private int idUserAccount;
    private double saldo;
    private String password;

    public Banco() {
    }

    public Banco(int idUserAccount, double saldo, String password) {
        this.idUserAccount = idUserAccount;
        this.saldo = saldo;
        this.password = password;
    }
    
    

    public int getIdUserAccount() {
        return idUserAccount;
    }

    public void setIdUserAccount(int idUserAccount) {
        this.idUserAccount = idUserAccount;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
