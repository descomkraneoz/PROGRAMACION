import javax.swing.*;

public class miBiblioteca {
    public static void main(String[] args) {

        Libro l = new Libro("Viaje al centro de la Tierra", "Julio Verne", 753, "Novelas", "Trata de la expedición de un profesor de mineralogía, su sobrino y un guía al interior del planeta Tierra");
        Libro m = new Libro("Los tres mosqueteros", "Alexandre Dumas", 345, "Novela", "Narra las aventuras de D`Artagnan, un joven de 18 años que se traslada a París para ser mosquetero. Junto a sus amigos Athos, Porthos y Aramis sirven al rey Luis XIII.");

        System.out.println("//////////////////////////////////");

        System.out.println(l.infoCorta());

        System.out.println(l.esTocho());

        System.out.println("//////////////////////////////////");

        JOptionPane.showMessageDialog(null, l.infoLarga(), "Libro consultado", JOptionPane.INFORMATION_MESSAGE);

        System.out.println(m.infoCorta());

        System.out.println(m.esTocho());

        System.out.println("//////////////////////////////////");

        JOptionPane.showMessageDialog(null, m.infoLarga(), "Libro consultado", JOptionPane.INFORMATION_MESSAGE);

    }
}
