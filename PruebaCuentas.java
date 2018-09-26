public class PruebaCuentas {

    public static void main(String[] args) {

        CuentaCorriente cuentaAna;
        cuentaAna=new CuentaCorriente ();
        //cuentaAna.titular="Ana";
        //cuentaAna.saldo=100;
        //System.out.println ( "La cuenta de " + cuentaAna.titular + " tiene " + cuentaAna.saldo+" Euros" );
        cuentaAna.ingresar ( 200 );
        cuentaAna.ingresar ( 300 );
        cuentaAna.retirar ( 100 );
        //System.out.println ( "La cuenta de " + cuentaAna.titular + " tiene " + cuentaAna.saldo+" Euros" );

    }

}
