import javax.swing.*;

public class EscribirEnOrdenInverso {

    public static void main(String[] args) {

        int primerNumero, segundoNumero, tercerNumero, bandera;

        do {
            try {
                bandera = 0;
                primerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número entero: "));
                segundoNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número entero: "));
                tercerNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer número entero: "));

                int ultimoNumero, penultimoNumero, antepenultimoNumero;

                ultimoNumero = primerNumero;
                penultimoNumero = segundoNumero;
                antepenultimoNumero = tercerNumero;

                JOptionPane.showMessageDialog(null, antepenultimoNumero + " , " + penultimoNumero + " , " + ultimoNumero, "Números en orden inverso", JOptionPane.INFORMATION_MESSAGE);


            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El carácter introducido no se corresponde con un número entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = 1;
            }
        } while (bandera != 0);


    }
}
