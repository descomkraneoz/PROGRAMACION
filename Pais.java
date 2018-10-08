public class Pais {
    private final String nombrePais;
    private final int superficie;
    private final double poblacion1995;
    private final double variacion9095;
    private final double poblacionRural1995;
    private final int PNB93;
    private final double tasaCrecimiento8593;

    public Pais(String nombrePais, int superficie, double poblacion1995, double variacion9095, double poblacionRural1995, int PNB93, double tasaCrecimiento8593) {
        this.nombrePais = nombrePais;
        this.superficie = superficie;
        this.poblacion1995 = poblacion1995;
        this.variacion9095 = variacion9095;
        this.poblacionRural1995 = poblacionRural1995;
        this.PNB93 = PNB93;
        this.tasaCrecimiento8593 = tasaCrecimiento8593;
    }

    public String getNombrePais() {
        return nombrePais+"\n";
    }

    public String getSuperficie() {
        String salida="";
        salida+="Superficie: ";
        salida+=String.format("%19s",superficie);
        salida+=" miles de hectáreas\n";

        return salida;
    }

    public String getPoblacion1995() {
        String salida="";
        salida="Población en 1995: "+String.format("%15.2f",poblacion1995);
        salida+=" millones\n";

        return salida;
    }

    public String getVariacion9095() {
        String salida="";
        salida+="Variación entre 1990-1995: "+String.format("%7.2f",variacion9095);
        salida+=" %\n";

        return salida;
    }

    public String getPoblacionRural1995() {
        String salida="";
        salida+="Población rural en 1995: "+String.format("%9.2f",poblacionRural1995);
        salida+=" %\n";

        return salida;
    }

    public String getPNB93() {
        String salida="";
        salida+="PNB per Capita en 1993: "+String.format("%7s",PNB93);
        salida+=" $\n";

        return salida;
    }

    public String getTasaCrecimiento8593() {
        String salida="";
        salida+="Tasa de crecimiento 85-93: "+String.format("%7.2f",tasaCrecimiento8593);
        salida+=" %\n";

        return salida;
    }

    public String separador(){
        String separador="";
        separador+="--------";
        separador+="----------";
        separador+="----------";
        separador+="----------";
        separador+="----------\n";

        return separador;
    }

    public String infoCompleta(){
        String infoCompleta="";
        infoCompleta+=getNombrePais();
        infoCompleta+=getSuperficie();
        infoCompleta+=getPoblacion1995();
        infoCompleta+=getVariacion9095();
        infoCompleta+=getPoblacionRural1995();
        infoCompleta+=getPNB93();
        infoCompleta+=getTasaCrecimiento8593();
        infoCompleta+=separador();

        return infoCompleta;
    }
}
