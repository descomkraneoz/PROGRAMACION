public class Linterna {

    private final String marca;
    private final int modelo;
    private final int numeroPilas;
    private final int luminosidad;
    private boolean estaApagada;
    private int precioEnEuros;

    public Linterna(String marca, int modelo, int numeroPilas, int luminosidad, boolean estaApagada, int precioEnEuros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numeroPilas = numeroPilas;
        this.luminosidad = luminosidad;
        this.estaApagada = estaApagada;
        this.precioEnEuros = precioEnEuros;
    }

    public String getMarca() {

        return marca;
    }

    public int getModelo() {

        return modelo;
    }

    public String getNumeroPilas() {

        String salida = numeroPilas + " AAA necesaria(s)";

        return salida;
    }

    public String getLuminosidad() {

        String salida = "";
        salida += luminosidad == 1 ? "\u2605\u2606\u2606\u2606\u2606" : "";
        salida += luminosidad == 2 ? "\u2605\u2605\u2606\u2606\u2606" : "";
        salida += luminosidad == 3 ? "\u2605\u2605\u2605\u2606\u2606" : "";
        salida += luminosidad == 4 ? "\u2605\u2605\u2605\u2605\u2606" : "";
        salida += luminosidad == 5 ? "\u2605\u2605\u2605\u2605\u2605" : "";
        return salida;
    }

    public void setEstaApagada(boolean estaApagada) {

        this.estaApagada = estaApagada;
    }

    public String estaEncendida() {

        String salida = estaApagada ? "la linterna esta apagada" : "La linterna esta encendida";

        return salida;
    }

    public int getPrecioEnEuros() {

        return precioEnEuros;
    }

    public void setPrecioEnEurosNuevo(int precioEnEurosNuevo) {

        this.precioEnEuros = precioEnEurosNuevo;
    }

    private int eurosDescontados;

    public void setDescuentoEnEuros(int eurosDescontados) {

        this.eurosDescontados = eurosDescontados;
    }

    public int getDescuentoEnEuros() {

        return precioEnEuros = precioEnEuros - eurosDescontados;
    }

    public String getTotalEnEuros() {

        String salida = "";
        salida += "Al precio original: " + getPrecioEnEuros() + " €\n";
        salida += "Descontamos: " + this.eurosDescontados + " €\n";
        salida += "Quedando un total de: " + getDescuentoEnEuros() + " €";

        return salida;
    }

    public String infoCorta() {
        return "Marca de la linterna: " + this.marca + "\n" + "Luminosidad: " + this.getLuminosidad() + "\n"
                + "Precio: " + this.precioEnEuros;
    }

    public String infoLarga() {
        return "Marca de la linterna: " + this.marca + "\n"
                + "Modelo: " + this.modelo + "\n"
                + "El número de pilas es: " + this.getNumeroPilas() + "\n"
                + "Luminosidad: " + this.getLuminosidad() + "\n"
                + "Precio: " + this.precioEnEuros + " €\n"
                + "Precio descontado: " + getDescuentoEnEuros() + " €";
    }


}