import javax.swing.*;

public class ParteDecimal {
    public static void main(String[] args) {

        double numberoDecimal;
        numberoDecimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número decimal: "));

        String str = String.valueOf(numberoDecimal);

        int parteEnteraNumeroDecimal = Integer.parseInt(str.substring(0, str.indexOf('.')));
        float parteDecimalNumeroDecimal = Float.parseFloat(str.substring(str.indexOf('.')));
        int parteDecimalNumeroDecimalEntera = Integer.parseInt(str.substring(str.indexOf('.') + 1));

        String salida;
        salida="La parte entera del número decimal es: "+parteEnteraNumeroDecimal+" \n";
        salida+="La parte decimal del número ingresado es: "+parteDecimalNumeroDecimal+" \n";
        salida+="La parte decimal como entero queda: "+parteDecimalNumeroDecimalEntera;

        JOptionPane.showMessageDialog(null,salida,"Parte decimal de un número",JOptionPane.INFORMATION_MESSAGE);
    }
}
