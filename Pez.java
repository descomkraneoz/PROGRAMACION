public class Pez {
    private final String especie;
    private int tamanio;

    private static int numeroPeces=0;

    public Pez(String especie, int tamanio){
        this.especie=especie;
        this.tamanio=tamanio;
        numeroPeces++;
    }

    public String getEspecie() {
        return especie;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public static int getNumeroPeces() {
        return numeroPeces;
    }


}
