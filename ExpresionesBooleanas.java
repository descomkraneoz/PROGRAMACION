import javax.swing.*;

public class ExpresionesBooleanas {
    public static void main(String[] args) {

        int a = 5, b = 3;

        boolean operacionUno, operacionDos;

        int bandera;

        do {
            try {
                bandera = 0;

                a = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor entero para a"));

                b = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor entero para b"));

                operacionUno = 25 > 20 && 13 > 5;
                operacionDos = !(a > b && 2 * a <= b);


                String salida = "El resultado de las operaciones es: \n";
                String salidaOperUno = "25>20 && 13>5 =";
                String salidaOperDos = "!(a>b && 2*a<=b) =";


                String tituloUno = "Operación con booleanos";


                String esVerdad = " Verdad ";
                String esFalso = " Falso ";

                if (operacionUno == true && operacionDos == true) {

                    JOptionPane.showMessageDialog(null, salida + salidaOperUno + esVerdad + "\n" + salidaOperDos + esVerdad, tituloUno, JOptionPane.INFORMATION_MESSAGE);

                } else if (operacionUno == true && operacionDos == false) {

                    JOptionPane.showMessageDialog(null, salida + salidaOperUno + esVerdad + "\n" + salidaOperDos + esFalso, tituloUno, JOptionPane.INFORMATION_MESSAGE);

                } else if (operacionUno == false && operacionDos == true) {

                    JOptionPane.showMessageDialog(null, salida + salidaOperUno + esFalso + "\n" + salidaOperDos + esVerdad, tituloUno, JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, salida + salidaOperUno + esFalso + " \n " + salidaOperDos + esFalso, tituloUno, JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception e) {
                System.out.println("El carácter no es válido");
                bandera = 1;
            }
        } while (bandera != 0);


    }
}
