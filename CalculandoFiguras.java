import javax.swing.*;

public class CalculandoFiguras {
    public static void main(String[] args) {

        boolean salir = false;
        int opcion;

        while (!salir) {

            String circunferencia="1. Longitud y área de la Circunferencia\n";
            String pitagoras="2. La longitud de la hipotenusa\n";
            String esfera="3. Volumen de una esfera\n";
            String triangulo="4. El área de un triángulo\n";
            String salida="5. Salir";
            String menu;
            menu=circunferencia+pitagoras+esfera+triangulo+salida;


            try {

                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,menu,"Elige una opción",JOptionPane.INFORMATION_MESSAGE));

                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado "+circunferencia);
                        int radioCircunferencia=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio de la circunferencia en cm: "));
                        double longitudCircunferencia = 2*Math.PI*radioCircunferencia;
                        double areaCircunferencia = Math.PI*Math.pow(radioCircunferencia,2);
                        String salidaUno="La longitud de la circunferencia es: "+String.format("%.2f", longitudCircunferencia)+" cm\n";
                        salidaUno+="El área de la circunferencia es: "+String.format("%.2f", areaCircunferencia)+" cm cuadrados";
                        JOptionPane.showMessageDialog(null, salidaUno);
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado "+pitagoras);
                        double catetoUno,catetoDos, operacionIntermedia, hipotenusa;
                        catetoUno=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del primer cateto en cm: "));
                        catetoDos=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del segundo cateto en cm: "));
                        operacionIntermedia=Math.pow(catetoUno,2)+Math.pow(catetoDos,2);
                        hipotenusa=Math.pow(operacionIntermedia,0.5);
                        String salidaDos="La longitud de la hipotenusa es: "+String.format("%.2f", hipotenusa)+" cm\n";
                        JOptionPane.showMessageDialog(null, salidaDos);
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado "+esfera);
                        double volumenEsfera, radioEsfera;
                        radioEsfera=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del radio en cm: "));
                        volumenEsfera=(4/3)*Math.PI*Math.pow(radioEsfera,3);
                        String salidaTres="El volumen de la esfera es: "+String.format("%.2f", volumenEsfera)+" cm cúbicos";
                        JOptionPane.showMessageDialog(null, salidaTres);
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Ha seleccionado "+triangulo);
                        double baseTriangulo,alturaTriangulo, areaTriangulo;
                        baseTriangulo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la base en cm: "));
                        alturaTriangulo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor de la altura en cm: "));
                        areaTriangulo=(baseTriangulo*alturaTriangulo)/2.0;
                        String salidaCuatro="La longitud de la hipotenusa es: "+String.format("%.2f", areaTriangulo)+" cm cuadrados\n";
                        JOptionPane.showMessageDialog(null, salidaCuatro);
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Solo números entre 1 y 5","Error",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {

                opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce opción válida: "));

            }
        }

    }

}
