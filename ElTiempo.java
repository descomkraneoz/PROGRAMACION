import javax.swing.*;

public class ElTiempo {

    private static int SEGUNDOS_EN_MINUTOS = 60;
    private static int SEGUNDOS_EN_HORAS = 3600;


    public static void main(String[] args) {

        int segundosIntroducidos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tiempo en segundos: "));

        int tiempoEnHoras = segundosIntroducidos / SEGUNDOS_EN_HORAS;

        int segundosSobrantes = segundosIntroducidos % SEGUNDOS_EN_HORAS;

        int tiempoEnMinutos = segundosSobrantes / SEGUNDOS_EN_MINUTOS;

        segundosSobrantes = segundosSobrantes % tiempoEnMinutos;

        char separador = ':';

        String salida = "El tiempo introducido en segundos fue: " + segundosIntroducidos + " segundos\n";
        salida += "Expresado en horas, minutos y segundos: " + tiempoEnHoras + separador + tiempoEnMinutos + separador + segundosSobrantes;

        JOptionPane.showMessageDialog(null, salida, "El tiempo en horas, minutos y segundos", JOptionPane.INFORMATION_MESSAGE);


    }
}
