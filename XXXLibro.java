public class Libro {

    private final String titulo;
    private final String autor;
    private final String genero;
    private final String sinopsis;
    private final int numeroPaginas;
    private double mediaCriticas;

    public Libro(String titulo, String autor, String genero, int numeroPaginas, String sinopsis) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
        this.sinopsis=sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public double getMediaCriticas() {
        return mediaCriticas;
    }

    public void setMediaCriticas(double mediaCriticas) {
        this.mediaCriticas = mediaCriticas;
    }

    public String infoCorta(){

        return this.titulo+" - "+this.autor;

    }

    public String infoLarga(){
        return "Título: "+this.getTitulo()+"\n"+"Autor: "+this.getAutor ()+"\n"
                +"Género: "+this.getGenero ()+"\n"+"Número de páginas: "+this.getNumeroPaginas ()+"\n"
                +"Sinópsis: "+this.getSinopsis ();
    }
}
