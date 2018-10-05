import javax.swing.*;

public class SumaYMedia {

    public static void main(String[] args) {

        int primerNumero, segundoNumero, tercerNumero, cuartoNumero, quintoNumero, sumaNumeros;
        double media;
        char separador = ',';

        primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número"));
        segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
        tercerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número"));
        cuartoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el cuarto número"));
        quintoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el quinto número"));

        sumaNumeros = primerNumero + segundoNumero + tercerNumero + cuartoNumero + quintoNumero;
        media = sumaNumeros / 5.0;

        String salida;

        salida = "Los números introducidos son: " + primerNumero + separador + segundoNumero + separador + tercerNumero + separador + cuartoNumero + separador + quintoNumero + "\n";
        salida += "La suma de estos números es: " + sumaNumeros + "\n";
        salida += "La media es: "+String.format("%.2f", media);

        JOptionPane.showMessageDialog(null, salida, "Salida de datos", JOptionPane.INFORMATION_MESSAGE);


    }

}
