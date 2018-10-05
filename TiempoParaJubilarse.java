import javax.swing.*;

public class TiempoParaJubilarse {

    public static int edadJubilacion = 65;

    public static void main(String[] args) {

        int tuEdad, aniosParaJubilarse;

        tuEdad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad actual:"));

        aniosParaJubilarse = edadJubilacion - tuEdad;

        String salida = "";
        salida += "Con " + tuEdad + " años\n";
        salida += "Te faltan " + aniosParaJubilarse + " años para jubilarte a los " + edadJubilacion + " años";

        JOptionPane.showMessageDialog(null, salida, "Años para jubilarse", JOptionPane.INFORMATION_MESSAGE);

    }
}
