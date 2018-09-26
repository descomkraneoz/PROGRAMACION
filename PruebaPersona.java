public class PruebaPersona {

    public static void main(String[] args) {

        Persona pepe=new Persona (); //inicializamos la clase, hacemos los huecos para las variables

        Persona juan=new Persona ();

        juan.alturaEnCentimetros=178;
        System.out.println ( juan.getAlturaEnCentimetros () );

        juan.edad=24;
        System.out.println ( juan.edad );
        juan.happyBirthday ();
        juan.happyBirthday ();
        juan.happyBirthday ();
        System.out.println ( juan.edad );

    }

}
