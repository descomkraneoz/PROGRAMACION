public class MiNumero {

    private int dameNumero;
    private int miNumeroDoble;
    private int miNumeroTriple;
    private int miNumeroCuadruple;


    public MiNumero(int dameNumero) {
        this.dameNumero = dameNumero;
    }

    public int getDameNumero() {
        return dameNumero;
    }

    public int getMiNumeroDoble() {

        miNumeroDoble = (int) Math.pow(dameNumero, 2);

        return miNumeroDoble;
    }

    public int getMiNumeroTriple() {

        miNumeroTriple = (int) Math.pow(dameNumero, 3);

        return miNumeroTriple;
    }

    public int getMiNumeroCuadruple() {

        miNumeroCuadruple = (int) Math.pow(dameNumero, 4);

        return miNumeroCuadruple;
    }

    public String infoNumero() {

        String salida = "";
        salida += "El número dado es: " + dameNumero + "\n";
        salida += "El doble del numero dado es: " + getMiNumeroDoble() + "\n";
        salida += "El triple de " + dameNumero + " es: " + getMiNumeroTriple() + "\n";
        salida += "El número " + dameNumero + " su cuadruple es: " + getMiNumeroCuadruple();

        return salida;
    }


}
