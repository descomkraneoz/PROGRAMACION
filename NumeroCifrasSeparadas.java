import javax.swing.*;

public class NumeroCifrasSeparadas {
    public static void main(String[] args) {

        int numeroLeido;
        numeroLeido=Integer.parseInt(JOptionPane.showInputDialog("Introduce número de 5 cifras: "));
        boolean esNumero= (numeroLeido >= 10000 && numeroLeido <= 99999);

        String salida= esNumero?"El número leido es: "+numeroLeido+"\n" :" No ha introducido un número válido de 5 cifras: "+numeroLeido +"\n";

        int decenaDeMillar=numeroLeido/10000;
        int resto=numeroLeido%10000;

        int unidadDeMillar=resto/1000;
        resto=numeroLeido%1000;

        int centena=resto/100;
        resto=numeroLeido%100;

        int decena=resto/10;
        resto=numeroLeido%10;

        String separador= " - ";

        salida+=decenaDeMillar+separador;
        salida+=unidadDeMillar+separador;
        salida+=centena+separador;
        salida+=decena+separador+resto+"\n";

        String salidaInvertida;
        salidaInvertida=resto+separador;
        salidaInvertida+=decena+separador;
        salidaInvertida+=centena+separador;
        salidaInvertida+=unidadDeMillar+separador+decenaDeMillar;

        System.out.println(salida+salidaInvertida);

    }

}
