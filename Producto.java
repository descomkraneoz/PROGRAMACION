public class Producto {

    public static final int IVA_PRODUCTOS = 21;
    private static final String NOMBRE_DE_LA_TIENDA ="En Tien21 -" ;
    private final String referencia;
    private final int precioAntesIVA;

    public static int numeroProductosCreados=0;

    public Producto(String referencia, int precioAntesIVA) {
        this.referencia = referencia;
        this.precioAntesIVA = precioAntesIVA;
        numeroProductosCreados++;
    }

    public int getNumeroProductosCreados(){
        return numeroProductosCreados;
    }

    public String getReferencia(){
        return referencia;
    }

    public int getPrecioAntesIVA(){
        return precioAntesIVA;
    }

    //IVA 21%

    public int precio(){
        return precioAntesIVA+precioAntesIVA*IVA_PRODUCTOS/100;
    }

    //Informacion

    public String informacion(){
        return NOMBRE_DE_LA_TIENDA+" Tenemos: "+this.referencia+" - "+this.precio()+" centimos de €.";
    }


}
