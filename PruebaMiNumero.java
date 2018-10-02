public class PruebaMiNumero {

    public static void main(String[] args) {

        MiNumero n = new MiNumero(5);

        System.out.println(n.infoNumero());

        MiNumeroVersionDos m = new MiNumeroVersionDos(2, 7, 5);

        System.out.println(m.infoNumero());
    }
}
