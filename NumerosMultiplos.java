import javax.swing.*;

public class NumerosMultiplos {

    public static void main(String[] args) {

        int primerNumero, segundoNumero, operacionMultiplo, bandera;

        do {
            try {
                bandera = 0;
                primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número entero: "));
                segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número entero: "));
                operacionMultiplo = primerNumero % segundoNumero;


                if (operacionMultiplo == 0) {
                    JOptionPane.showMessageDialog(null, primerNumero + " y " + segundoNumero + "\n" + "Son números multiplos", "MULTIPLOS", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, primerNumero + " y " + segundoNumero + "\n" + "NO son números multiplos", "NO MULTIPLOS", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El carácter introducido no se corresponde con un número entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = 1;
            }
        } while (bandera != 0);

    }

}
