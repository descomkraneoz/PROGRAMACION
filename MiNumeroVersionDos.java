public class MiNumeroVersionDos {


    private int miNumeroDoble;
    private int miNumeroTriple;
    private int miNumeroCuadruple;


    public MiNumeroVersionDos(int miNumeroDoble, int miNumeroTriple, int miNumeroCuadruple) {
        this.miNumeroDoble = miNumeroDoble;
        this.miNumeroTriple = miNumeroTriple;
        this.miNumeroCuadruple = miNumeroCuadruple;

    }

    public int getMiNumeroDoble() {

        miNumeroDoble = (int) Math.pow(miNumeroDoble, 2);

        return miNumeroDoble;
    }

    public int getMiNumeroTriple() {

        miNumeroTriple = (int) Math.pow(miNumeroTriple, 3);

        return miNumeroTriple;
    }

    public int getMiNumeroCuadruple() {

        miNumeroCuadruple = (int) Math.pow(miNumeroCuadruple, 4);

        return miNumeroCuadruple;
    }

    public String infoNumero() {

        String salida = "";

        salida += "El doble del numero: " + miNumeroDoble + " es: " + getMiNumeroDoble() + "\n";
        salida += "El triple de " + miNumeroTriple + " es: " + getMiNumeroTriple() + "\n";
        salida += "El número " + miNumeroCuadruple + " su cuadruple es: " + getMiNumeroCuadruple();

        return salida;
    }


}

