import javax.swing.*;

public class HoraFutura {

    public static void main(String[] args) {

        int horaActual, cantidadHoras, horaFutura;

        horaActual=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora actual: "));

        cantidadHoras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una cantidad de horas: "));

        horaFutura=(horaActual+cantidadHoras)%24;

        String salida;
        salida="En "+cantidadHoras+" horas, serán las "+horaFutura;

        JOptionPane.showMessageDialog(null,salida,"¿Que hora será dentro de...?",JOptionPane.INFORMATION_MESSAGE);
    }
}
