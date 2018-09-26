public class ParteDecimalDos{
    public static void main(String[] args) {
        double numero=5.87;
        int parteEntera=(int)numero;
        System.out.println (parteEntera);
        double decimales=numero-parteEntera;
        String salida=String.format ("%.2f",decimales);
        System.out.println (salida);
    }

}
