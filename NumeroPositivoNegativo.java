import javax.swing.*;

public class NumeroPositivoNegativo {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero: "));

        boolean esPositivo=numero>=0;
        boolean esNegativo=numero<0;
        boolean noEsNumero=true;



        String salida= "El número introducido es: "+numero+"\n";
        salida+=esPositivo?"El número es POSITIVO":(esNegativo?"El número es NEGATIVO":(noEsNumero?"El carácter introducido no es un número válido":""));

        JOptionPane.showMessageDialog(null, salida, "Números",JOptionPane.INFORMATION_MESSAGE);


        /*int numero, bandera;

        do {
            try {
                bandera = 0;
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entero: "));

                if (numero >= 0) {
                    JOptionPane.showMessageDialog(null, "El número introducido es POSITIVO: " + numero);
                } else {
                    JOptionPane.showMessageDialog(null, "El número introducido es NEGATIVO: " + numero);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "El carácter introducido no se corresponde con un número entero", "ERROR", JOptionPane.ERROR_MESSAGE);
                bandera = 1;
            }
        } while (bandera != 0);*/

    }
}



