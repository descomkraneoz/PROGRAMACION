import javax.swing.*;

public class CaracterAnglosajon {

    public static void main(String[] args) {

        char caracter;

        caracter = JOptionPane.showInputDialog("Introduce un carácter: ").charAt(0);

        boolean esMayuscula = (caracter >= 'A' && caracter <= 'Z');
        boolean esMinuscula = (caracter >= 'a' && caracter <= 'z');
        boolean esNumero = (caracter >= '0' && caracter <= '9');

        String salida = "Tu carácter es: " + caracter + "\n";
        salida += esMayuscula ? "Tu carácter es una letra mayúscula" : (esMinuscula ? "Tu carácter es una letra minúscula" : (esNumero ? "El carácter es un número" : "El carácter introducido no se corresponde con un carácter anglosajón"));
        JOptionPane.showMessageDialog(null, salida, "Carácter anglosajón", JOptionPane.INFORMATION_MESSAGE);


        /*if (caracter >= 'a' && caracter <= 'z') {
            JOptionPane.showMessageDialog(null, "El carácter introducido es una letra minúscula", "MINúSCULA", JOptionPane.INFORMATION_MESSAGE);
        } else if (caracter >= 'A' && caracter <= 'Z') {
            JOptionPane.showMessageDialog(null, "El carácter introducido es una letra mayúscula", "MAYÚCULA", JOptionPane.INFORMATION_MESSAGE);
        } else if (caracter >= '1' && caracter <= '9') {
            JOptionPane.showMessageDialog(null, "El carácter introducido es un número", "NÚMERO", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "El carácter introducido no se corresponde con un carácter anglosajon", "ERROR", JOptionPane.ERROR_MESSAGE);
        }*/
    }
}


