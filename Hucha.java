public class Hucha{

    public final static String FORMA_HUCHAS="Cerdito";

    private static int DineroTotal=0;

    private final String propietario;
    private int dinero;

    public Hucha(String propietario){
        this.propietario=propietario;
        this.dinero=0;
    }

    public void anyadeDinero(int dineroAAnyadir){
        this.dinero+=dineroAAnyadir;
        this.DineroTotal+=dineroAAnyadir;
    }

    public int getDinero(){
        return this.dinero;
    }

    public String getPropietario(){
        return this.propietario;
    }

    public int getTotal(){
        return DineroTotal;
    }

}