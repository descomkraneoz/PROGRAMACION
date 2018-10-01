public class Videojuego{
    private final String titulo;
    private final String descripcion;
    private boolean disponiblePS4;
    private boolean disponibleXBOX;
    private boolean disponiblePC;
    private final int anyoDeLanzamiento;
    private int valoracion;
    private int precio;
    private boolean estaDeOferta;
    private int porcentajeOferta;

    public Videojuego(String titulo, String descripcion, int anyoDeLanzamiento, int precio) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.anyoDeLanzamiento = anyoDeLanzamiento;
        this.precio=precio;
    }

    public String infoRapida(){
        String salida="";
        salida+=this.titulo+" - ";
        salida+=this.getValoracionEstrellas ()+" - ";

        //salida+=" Precio: "+this.precio/100+","+this.precio%100+" €";
        salida+=" Precio: "+this.precio+" centimos de €";
        return salida;
    }

    public String getTitulo() {
        return titulo.toUpperCase ();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getAnyoDeLanzamiento() {
        return anyoDeLanzamiento;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getValoracionEstrellas(){
        String salida="";
        salida+=valoracion==1?"\u2605\u2606\u2606\u2606\u2606":"";
        salida+=valoracion==2?"\u2605\u2605\u2606\u2606\u2606":"";
        salida+=valoracion==3?"\u2605\u2605\u2605\u2606\u2606":"";
        salida+=valoracion==4?"\u2605\u2605\u2605\u2605\u2606":"";
        salida+=valoracion==5?"\u2605\u2605\u2605\u2605\u2605":"";
        return salida;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void disponiblePS4(){
        disponiblePS4=true;
        disponiblePC=false;
        disponibleXBOX=false;
    }

    public void disponiblePC(){
        disponiblePS4=false;
        disponiblePC=true;
        disponibleXBOX=false;
    }

    public void disponibleXBOX(){
        disponiblePS4=false;
        disponiblePC=false;
        disponibleXBOX=true;
    }

    public void disponiblePS4XBOX(){
        disponiblePS4=true;
        disponiblePC=false;
        disponibleXBOX=true;
    }

    public void disponiblePS4PC(){
        disponiblePS4=true;
        disponiblePC=true;
        disponibleXBOX=false;
    }

    public void disponiblePCXBOX(){
        disponiblePS4=false;
        disponiblePC=true;
        disponibleXBOX=true;
    }

    public void disponiblePS4PCXBOX(){
        disponiblePS4=true;
        disponiblePC=true;
        disponibleXBOX=true;
    }


}
