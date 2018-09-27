import javax.swing.*;

public class MiBiblioteca {

    public static void main(String[] args) {

        Libro libro=new Libro ("Rebelión","Orwell","Ciencia Ficción",400,"Una granja con problemas");

        System.out.println ("Título: "+libro.getTitulo());
        System.out.println ("Autor: "+libro.getAutor ());
        System.out.println ("Género: "+libro.getGenero ());
        System.out.println ("Número de páginas: "+libro.getNumeroPaginas ());
        System.out.println ("Sinópsis: "+libro.getSinopsis ());

        System.out.println ("////////////////////////////////////////////////");

        System.out.println ( libro.infoCorta () );
        JOptionPane.showMessageDialog ( null, libro.infoCorta () );

        System.out.println ("////////////////////////////////////////////////");

        System.out.println ( libro.infoLarga () );
        JOptionPane.showMessageDialog ( null,libro.infoLarga () );

        System.out.println ("////////////////////////////////////////////////");

        Libro otroLibro=new Libro ( "La gitanilla","Cervantes","Novela",60,"Una gitanilla que baila" );

       JOptionPane.showMessageDialog ( null,otroLibro.infoLarga () );

    }
}
