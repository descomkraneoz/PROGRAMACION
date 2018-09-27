import java.util.Scanner;

public class CalcularValorScanner {

    public static void main(String[] args) {

        int a;
        int b;
        int operacionUno, operacionDos, operacionTres;

        Scanner sc = new Scanner(System.in);

        int bandera;

        do {
            try {
                bandera = 0;

                System.out.println("Introduce el valor de a:");
                a = sc.nextInt();
                System.out.println("Introduce el valor de b:");
                b = sc.nextInt();

                operacionUno = -a + (5 % b) - (a * a);
                operacionDos = 5 + (3 % 7) + (b * a) - (b % a);
                operacionTres = (a + 1) * (b + 1) - (b / a);

                String salida = "El resultado de la operación es: ";

                System.out.println(salida + operacionUno);
                System.out.println(salida + operacionDos);
                System.out.println(salida + operacionTres);


            } catch (Exception e) {
                System.out.println("El carácter no es válido");
                bandera = 1;
            }
        } while (bandera != 0);


    }
}

