import javax.swing.*;

public class PruebaTablaMultiplicar {
    public static void main(String[] args) {

        TablaMultiplicar t = new TablaMultiplicar(9);

        t.setSeparador('-');
        System.out.println(t.mostrarTabla());

        t.setNumeroPedido(5);

        System.out.println(t.mostrarTabla());

        TablaMultiplicar p = new TablaMultiplicar(3);

        System.out.println(p.mostrarTabla());

        JOptionPane.showMessageDialog(null, p.mostrarTabla(), "Las tablas", JOptionPane.INFORMATION_MESSAGE);


    }

}
