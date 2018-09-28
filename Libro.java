public class Libro {

    private final String titulo;
    private final String autor;
    private final int numeroPaginas;
    private final String genero;
    private final String sinopsis;


    public Libro(String titulo, String autor, int numeroPaginas, String genero, String sinopsis) {

        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
        this.sinopsis = sinopsis;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String infoCorta() {
        return "Título del libro: " + this.titulo + "\n" + "Autor/es: " + this.autor;
    }

    public String infoLarga() {
        return "Título del libro: " + this.titulo + "\n"
                + "Autor/es: " + this.autor + "\n"
                + "El número de páginas del libro es: " + this.numeroPaginas + "\n"
                + "Pertenece al género: " + this.genero + "\n"
                + "Breve sinópsis: " + this.sinopsis;
    }


    private boolean esTocho;

    public String esTocho() {

        esTocho = numeroPaginas >= 500;

        return esTocho ? "El libro es un tocho de 500 o más páginas: " + this.esTocho :
                "El libro no es un tocho";

    }

}
