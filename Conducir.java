import javax.swing.*;

public class Conducir {

    enum edadEnSpain {

        edadMinima(18), edadMaxima(75), edadEspecial(16);

        private edadEnSpain(int edadParaConducir) {
            this.edadParaConducir = edadParaConducir;
        }

        private int edadParaConducir;

    }

    public static void main(String[] args) {

        int edad;
        boolean permisoPaterno = true;
        boolean permisoConducir = true;
        int carnetConducir;
        int permisoPaternoCarnet;


        /*a)Se puede conducir si se tiene entre 18 y 75 años de edad.
         A partir de 16 años se puede conducir si se tiene permiso paterno.
         En todo caso es necesario el permiso de conducir.
        */

        edad = Integer.parseInt(JOptionPane.showInputDialog("¿Que edad tienes? "));

        if (edad >= edadEnSpain.edadMaxima.edadParaConducir) {
            JOptionPane.showMessageDialog(null, "Eres demasiado mayor para conducir");
        } else if ((edad >= edadEnSpain.edadMinima.edadParaConducir) && (permisoConducir == true)) {
            String salida = "Tienes la edad para poder conducir";

            carnetConducir = JOptionPane.showConfirmDialog(null, "¿Tienes permiso de conducir?", "Permiso de conducir vehículos", JOptionPane.YES_NO_OPTION);

            if (carnetConducir == 1) {
                JOptionPane.showMessageDialog(null, salida + "\n" + "Todavía no tienes el permiso para poder conducir");
            } else {
                JOptionPane.showMessageDialog(null, salida + "\n" + "Tienes el permiso para conducir");
            }

        } else if ((edad == edadEnSpain.edadEspecial.edadParaConducir) && (permisoPaterno == true)) {

            permisoPaternoCarnet = JOptionPane.showConfirmDialog(null, "¿Tienes el permiso paterno para poder conducir?", "Permiso de conducir vehículos", JOptionPane.YES_NO_OPTION);

            if (permisoPaternoCarnet == 1) {
                JOptionPane.showMessageDialog(null, "Todavía no tienes el permiso paterno ni la edad para poder conducir");
            } else {
                JOptionPane.showMessageDialog(null, "Tienes el permiso paterno para conducir");
            }

        } else {
            JOptionPane.showMessageDialog(null, "No tienes edad para conducir");
        }

    }

}


