import javax.swing.*;

public class BasicoUno {

    public static void main(String[] args) {

        int N;
        double A, suma, diferencia;
        char C;

        int bandera;

        do {
            try {
                bandera = 0;

                N = Integer.parseInt(JOptionPane.showInputDialog("Introduce valor entero para N"));

                A = Double.parseDouble(JOptionPane.showInputDialog("Introduce valor para A"));

                C = JOptionPane.showInputDialog("Introduce valor para C").charAt(0);

                suma = N + A;
                diferencia = A - N;

                System.out.println("La suma de N+A es: " + suma);
                System.out.println("La diferencia entre A-N es: " + diferencia);
                System.out.println("El carácter de C es: " + C);


            } catch (Exception e) {
                System.out.println("El carácter no es válido");
                bandera = 1;
            }
        } while (bandera != 0);

    }
}
