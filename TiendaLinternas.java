public class TiendaLinternas {
    public static void main(String[] args) {

        Linterna l=new Linterna("Vandal",123456,3,3,true,15);

        System.out.println(l.infoCorta());

        System.out.println(l.estaEncendida());

        l.setEstaApagada(false);

        System.out.println(l.estaEncendida());

        l.setPrecioEnEuros(10);

        System.out.println(l.getPrecioEnEuros());

        l.setPrecioRebajadoEuros(5);

        System.out.println(l.infoLarga());

    }
}
