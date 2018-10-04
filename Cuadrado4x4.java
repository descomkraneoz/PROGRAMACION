public class Cuadrado4x4 {

    private String cadenaRepetir;

    Cuadrado4x4(String cadenaRepetir){
        this.cadenaRepetir=cadenaRepetir;
    }

    public String getCadenaRepetir(){
        String salida="";
        salida+=cadenaRepetir+cadenaRepetir+cadenaRepetir+cadenaRepetir+"\n";
        salida+=cadenaRepetir+cadenaRepetir+cadenaRepetir+cadenaRepetir+"\n";
        salida+=cadenaRepetir+cadenaRepetir+cadenaRepetir+cadenaRepetir+"\n";
        salida+=cadenaRepetir+cadenaRepetir+cadenaRepetir+cadenaRepetir+"\n";
        return salida;
    }

    public void setCadenaRepetir(String cadenaRepetir){
        this.cadenaRepetir=cadenaRepetir;
    }

}
