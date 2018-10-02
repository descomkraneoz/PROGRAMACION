public class Billete {

    private static final int BILLETE_DE_QUINIENTOS = 500;
    private static final int BILLETE_DE_DOSCIENTOS = 200;
    private static final int BILLETE_DE_CIEN = 100;
    private static final int BILLETE_DE_CINCUENTA = 50;
    private static final int BILLETE_DE_VEINTE = 20;
    private static final int BILLETE_DE_DIEZ = 10;
    private static final int BILLETE_DE_CINCO = 5;

    private int ingresaCantidadEuros;
    private int restoEuros;
    private boolean esCero;


    public Billete(int ingresaCantidadEuros) {
        this.ingresaCantidadEuros = ingresaCantidadEuros;
    }

    public String getBilleteQuinientos() {

        int billeteQuinientos = this.ingresaCantidadEuros / BILLETE_DE_QUINIENTOS;

        esCero = billeteQuinientos == 0;

        return esCero ? "Ningún billete de 500 €" : billeteQuinientos + " billete/s de 500 €";
    }

    public String getBilleteDoscientos() {

        restoEuros = this.ingresaCantidadEuros % BILLETE_DE_QUINIENTOS;
        int billeteDoscientos = restoEuros / BILLETE_DE_DOSCIENTOS;

        esCero = billeteDoscientos == 0;

        return esCero ? "Ningún billete de 200 €" : billeteDoscientos + " billete/s de 200 €";
    }

    public String getBilleteCien() {

        restoEuros = restoEuros % BILLETE_DE_DOSCIENTOS;
        int billeteCien = restoEuros / BILLETE_DE_CIEN;

        esCero = billeteCien == 0;

        return esCero ? "Ningún billete de 100 €" : billeteCien + " billete/s de 100 €";
    }

    public String getBilleteCincuenta() {

        restoEuros = restoEuros % BILLETE_DE_CIEN;
        int billeteCincuenta = restoEuros / BILLETE_DE_CINCUENTA;

        esCero = billeteCincuenta == 0;

        return esCero ? "Ningún billete de 50 €" : billeteCincuenta + " billete/s de 50 €";
    }

    public String getBilleteVeinte() {

        restoEuros = restoEuros % BILLETE_DE_CINCUENTA;
        int billeteVeinte = restoEuros / BILLETE_DE_VEINTE;

        esCero = billeteVeinte == 0;

        return esCero ? "Ningún billete de 20 €" : billeteVeinte + " billete/s de 20 €";
    }

    public String getBilleteDiez() {

        restoEuros = restoEuros % BILLETE_DE_VEINTE;
        int billeteDiez = restoEuros / BILLETE_DE_DIEZ;

        esCero = billeteDiez == 0;

        return esCero ? "Ningún billete de 10 €" : billeteDiez + " billete/s de 10 €";
    }

    public String getBilleteCinco() {

        restoEuros = restoEuros % BILLETE_DE_DIEZ;
        int billeteCinco = restoEuros / BILLETE_DE_CINCO;

        esCero = billeteCinco == 0;

        return esCero ? "Ningún billete de 5 €" : billeteCinco + " billete/s de 5 €";
    }

    public String tuCambio() {
        String salida = "";
        salida += getBilleteQuinientos() + "\n";
        salida += getBilleteDoscientos() + "\n";
        salida += getBilleteCien() + "\n";
        salida += getBilleteCincuenta() + "\n";
        salida += getBilleteVeinte() + "\n";
        salida += getBilleteDiez() + "\n";
        salida += getBilleteCinco() + "\n";
        salida += esCero ? "No hay monedicas sueltas" : this.restoEuros + " € suelto/s en moneda/s";

        return salida;

    }
}
