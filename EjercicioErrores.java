public class EjercicioErrores {

    public static void main(String[] args) {


        final int A = 10;

        int a, f;

        byte b;

        long c;

        float d;

        double e;


        a = 10;

        b = 20;

        b = (byte) a;

        b = (byte) 200;

        a = (int) 10L;

        c = 10L;

        d = 3.5f;

        e = 7.5;

        f = (int) (d / e);

        e = d;

        //A = 14;

    }

}