import javax.swing.*;

public class NumeroInvertido {

    public static void main(String[] args) {

        String numeroIngresado, salida;
        String numeroInvertido = "";

        numeroIngresado = JOptionPane.showInputDialog("Ingrese un número entero: ");

        for (int i = numeroIngresado.length() - 1; i >= 0; i--) {

            numeroInvertido = numeroInvertido + numeroIngresado.charAt(i);
        }

        salida = "El número ingresado es: " + numeroIngresado + " \n";
        salida += "Si lo invertimos queda así: " + numeroInvertido;

        JOptionPane.showMessageDialog(null, salida, "Invertimos un número", JOptionPane.INFORMATION_MESSAGE);
    }
}
