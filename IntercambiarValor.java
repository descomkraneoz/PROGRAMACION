import javax.swing.*;

public class IntercambiarValor {

    public static void main(String[] args) {

        int a, b;

        int bandera;

        do {
            try {
                bandera = 0;

                a = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor entero para \"a\" :"));
                b = Integer.parseInt(JOptionPane.showInputDialog("Introduce un valor entero para \"b\" :"));

                JOptionPane.showMessageDialog(null, "El valor antes del cambio de las variables es:\n" + "\"a\"=" + a + "\n" + "\"b\"=" + b, "Antes del cambio", JOptionPane.INFORMATION_MESSAGE);

                int cambio = 0;

                cambio = a;
                a = b;
                b = cambio;

                JOptionPane.showMessageDialog(null, "El valor despues del cambio de las variables es:\n" + "\"a\"=" + a + "\n" + "\"b\"=" + b, "Después del cambio", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El carácter introducido no se corresponde con un valor entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = 1;
            }
        } while (bandera != 0);

    }
}
