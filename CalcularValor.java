import javax.swing.*;

public class CalcularValor {

    public static void main(String[] args) {

        int a = 2;
        int b = 4;
        int operacionUno, operacionDos, operacionTres;

        int bandera;

        do {
            try {
                bandera = 0;

                a = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor entero para a"));

                b = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor entero para b"));

                operacionUno = -a + (5 % b) - (a * a);
                operacionDos = 5 + (3 % 7) + (b * a) - (b % a);
                operacionTres = (a + 1) * (b + 1) - (b / a);

                String salida = "El resultado de la operación es: ";

                String tituloUno = "Operación: -a+(5%b)-(a*a)";
                String tituloDos = "Operación: 5+(3%7)+(b*a)-(b%a)";
                String tituloTres = "Operación: (a+1)*(b+1)-(b/a)";


                JOptionPane.showMessageDialog(null, salida + operacionUno, tituloUno, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, salida + operacionDos, tituloDos, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, salida + operacionTres, tituloTres, JOptionPane.INFORMATION_MESSAGE);


            } catch (Exception e) {
                System.out.println("El carácter no es válido");
                bandera = 1;
            }
        } while (bandera != 0);


    }
}
