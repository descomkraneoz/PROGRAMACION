import javax.swing.*;

public class Creditos {

    public static void main(String[] args) {

        int saldo;

        int aval;

        int creditoPedido;

        int preguntaCreditoPedido;

        int preguntaAval;


        preguntaCreditoPedido = JOptionPane.showConfirmDialog(null, "¿Va a solicitar un crédito?", "Solicitud de crédito", JOptionPane.YES_NO_OPTION);

        if (preguntaCreditoPedido == 1) {
            JOptionPane.showMessageDialog(null, "Adios y que pase un buen día");
        } else {

            creditoPedido = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad solicitada: "));

            preguntaAval = JOptionPane.showConfirmDialog(null, "¿Dispone de aval?", "Solicitud de aval", JOptionPane.YES_NO_OPTION);

            if (preguntaAval == 1) {
                saldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el saldo actual de su cuenta: "));
                if (saldo > creditoPedido) {
                    JOptionPane.showMessageDialog(null, "Se le concede el crédito");
                } else {
                    JOptionPane.showMessageDialog(null, "No podemos conceder el crédito solicitado");
                }
            } else {
                aval = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad del aval: "));

                saldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el saldo actual de su cuenta: "));

                int operacionUno = (int) (0.7 * creditoPedido);
                int operacionDos = (int) (2 * (0.3 * creditoPedido));


                if ((saldo > creditoPedido || saldo > operacionUno && (aval > operacionDos))) {
                    JOptionPane.showMessageDialog(null, "Se le concede el crédito");
                } else {
                    JOptionPane.showMessageDialog(null, "No reune los requisitos para que se le conceda el crédito");
                }

            }

        }

    }

}
