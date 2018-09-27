import javax.swing.*;

public class JaspBoolean {

    private static int edadMayor = 28;
    private static int ingresosMenores = 28000;

    public enum estudios {
        PRIMARIOS(1),
        SECUNDARIOS(2),
        BACHILLER(3),
        FP(4),
        UNIVERSITARIOS(5),
        OTROS(6);
        private final int nivel_de_estudios;

        estudios(int a) {
            nivel_de_estudios = a;
        }

        public int getNivel_de_estudios() {
            return nivel_de_estudios;
        }

    }

    public static void main(String[] args) {

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu edad."));
        int nivel_de_estudios = Integer.parseInt(JOptionPane.showInputDialog("Escribe tu nivel de estudios: \n"
                + "PRIMARIOS=1\n" + "SECUNDARIOS=2\n" + "BACHILLER=3\n" + "FP=4\n" + "UNIVERSITARIOS=5\n" + "OTROS=6"));
        int ingresos = Integer.parseInt(JOptionPane.showInputDialog("Escribe tus ingresos."));

        boolean jasp = (edad <= edadMayor) && (nivel_de_estudios > estudios.BACHILLER.getNivel_de_estudios()) && (ingresos > ingresosMenores);

        String salida = "Según tus datos ";
        salida += jasp ? "puedes" : "no puedes";
        salida += " estudiar";

        JOptionPane.showMessageDialog(null, salida);
    }
}
