public class CuentaCorriente {
    private int saldo;
    private String titular;

    public void ingresar(int dinero){
        saldo+=dinero;
    }

    public void retirar(int dinero){
        saldo-=dinero;
    }

    public int getSaldo() {
        return this.saldo;
    }
}
