import java.util.Scanner;

public class JaspBooleanScanner {

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

        Scanner sc = new Scanner(System.in);

        int edad, nivel_de_estudios, ingresos;

        System.out.println("Escribe tu edad.");
        edad = sc.nextInt();
        System.out.println("Escribe tu nivel de estudios: \n"
                + "PRIMARIOS=1\n" + "SECUNDARIOS=2\n" + "BACHILLER=3\n" + "FP=4\n" + "UNIVERSITARIOS=5\n" + "OTROS=6");
        nivel_de_estudios = sc.nextInt();
        System.out.println("Escribe tus ingresos.");
        ingresos = sc.nextInt();

        boolean jasp = (edad <= edadMayor) && (nivel_de_estudios > estudios.BACHILLER.getNivel_de_estudios()) && (ingresos > ingresosMenores);

        String salida = "Según tus datos ";
        salida += jasp ? "puedes" : "no puedes";
        salida += " estudiar";

        System.out.println(salida);
    }
}
