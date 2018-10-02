public class TiendaLinternas {
    public static void main(String[] args) {

        Linterna l = new Linterna("Vandal", 123456, 3, 3, true, 15);

        System.out.println(l.infoCorta());

        System.out.println("/////////////////////////////////////");

        System.out.println(l.estaEncendida());

        l.setEstaApagada(false);

        System.out.println(l.estaEncendida());

        System.out.println("/////////////////////////////////////");

        l.setPrecioEnEurosNuevo(20);

        l.setDescuentoEnEuros(8);

        System.out.println(l.infoLarga());

        System.out.println("/////////////////////////////////////");

        System.out.println(l.getTotalEnEuros());

    }
}
