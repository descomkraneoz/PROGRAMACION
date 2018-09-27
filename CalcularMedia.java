import javax.swing.*;

public class CalcularMedia {

    public static void main(String[] args) {

        int preguntaInicial, primerNumero, segundoNumero, tercerNumero, bandera;
        double media;

        preguntaInicial = JOptionPane.showConfirmDialog(null, "Vamos a calcular la media de tres números\n" + "¿Estas listo para empezar?", "Media de tres números", JOptionPane.YES_NO_OPTION);

        do {
            try {
                bandera = 0;
                if (preguntaInicial == 0) {
                    primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu primer número."));
                    segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu segundo número."));
                    tercerNumero = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu tercer número."));

                    media = (primerNumero + segundoNumero + tercerNumero) / 3.0;

                    String salida="Números escritos: " + primerNumero + ", " + segundoNumero + " y " + tercerNumero + "\nLa media es: " + String.format("%.2f", media);

                    JOptionPane.showMessageDialog(null, salida);

                } else {
                    JOptionPane.showMessageDialog(null, "Adios!!!" + "\nVuelve cuando quieras empezar", "Despedida", JOptionPane.CLOSED_OPTION);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El carácter introducido no se corresponde con un número entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = 1;
            }
        } while (bandera != 0);
    }
}
