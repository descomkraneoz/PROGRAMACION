public class GameStore {
    public static void main(String[] args) {

        Videojuego rdr2=new Videojuego ( "Red Dead Redemption 2","Del Oeste",2018, 6995 );

        rdr2.setValoracion ( 5 );

        System.out.println (rdr2.infoRapida ());

        Videojuego sottr=new Videojuego ( "Shadow of the Tomb Raider","Lara dando saltitos",2018,6390 );

        sottr.setValoracion ( 3 );

        System.out.println (sottr.infoRapida ());

        System.out.println (rdr2.getValoracionEstrellas (  ));
    }

}
