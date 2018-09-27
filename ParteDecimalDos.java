public class ParteDecimalDos{
    public static void main(String[] args) {
        double numero=-5.87;
        int parteEntera=(int)numero;
        System.out.println (parteEntera);
        double decimales=numero-parteEntera;
        boolean esNumeroPositivo=decimales>=0;
        decimales=esNumeroPositivo?decimales:decimales*(-1);
        String salida=String.format ("%.2f",decimales);
        System.out.println (salida);
    }

}
