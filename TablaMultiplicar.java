public class TablaMultiplicar {

    private int numeroPedido;
    private int operador;
    private int resultado;
    private char separador;

    public TablaMultiplicar(int numeroPedido) {
        this.numeroPedido = numeroPedido;
        operador = 1;
        separador = 'x';
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public int getOperador() {
        return operador++;
    }

    public int getResultado() {
        resultado = numeroPedido * getOperador();
        return resultado;
    }

    public char getSeparador() {
        return separador;
    }

    public void setSeparador(char separador) {
        this.separador = separador;
    }

    public String mostrarTabla() {
        String salida = "";
        salida += "-----------------------------------------------\n";
        salida += String.format("%35s", "La tabla de multiplicar del " + numeroPedido) + "\n";
        salida += "-----------------------------------------------\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%4s", " = ") + getResultado() + "\n";
        salida += getNumeroPedido() + " " + getSeparador() + " " + this.operador + String.format("%2s", " = ") + getResultado() + "\n";
        salida += "-----------------------------------------------\n";
        salida += "-----------------------------------------------\n";
        operador = 1;
        return salida;
    }
}
