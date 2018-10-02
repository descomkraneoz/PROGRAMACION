import javax.swing.*;

public class Cadena4x4 {

    public static void main(String[] args) {

        String cadena = "";

        cadena = JOptionPane.showInputDialog("Introduce una cadena: ");

        for (int i = 0; i <= 3; i++) {

            String salida = cadena + cadena + cadena + cadena;

            System.out.println(salida);

        }
    }
}
