public class Fruteria {
    public static void main(String[] args) {

        Producto limon=new Producto("1Kg de Limones",50);
        Producto kiwi=new Producto("una pieza de kiwi",25);

        System.out.println("Estamos cobrando el "+Producto.IVA_PRODUCTOS+"% de IVA");

        System.out.println(limon.informacion());
        System.out.println(kiwi.informacion());

        System.out.println("Número de productos creados: "+Producto.numeroProductosCreados+" productos");



    }

}
