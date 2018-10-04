public class OperadorTernario {
    public static void main(String[] args) {

        int a=100;
        String cadena=(a==100)?"a es cien": "a no es cien";

        int edad=18;

        //Error de uso de booleanos NO HACER
        boolean esMayorDeEdad=(edad>=18)?true:false;
        //equivalente a
        esMayorDeEdad=(edad>=18);

        String votacion=esMayorDeEdad?"Puede votar":"No puede votar";

        String firmaConsentimiento=(!esMayorDeEdad)?"Firma de Padres":"No necesita";



    }

}
