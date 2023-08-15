package ejercicio3;
import ejercicio3.abstractas.CuentaBase;


public class CuentaCorriente extends CuentaBase {
    private double limiteSobregiro;

    public CuentaCorriente(String titular, double saldoInicial, double limiteSobregiro) {
        super(titular, saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && (consultarSaldo() + limiteSobregiro) >= cantidad) {
            double nuevoSaldo = consultarSaldo() - cantidad;
            if (nuevoSaldo < 0) {
                limiteSobregiro += nuevoSaldo;
                nuevoSaldo = 0;
            }
            establecerSaldo(nuevoSaldo);
            System.out.println("Retiro de " + cantidad + " realizado de la cuenta de " + getTitular());
            return true;
        } else {
            System.out.println("No es posible realizar el retiro.");
            return false;
        }
    }

    private void establecerSaldo(double nuevoSaldo) {
        super.saldo = nuevoSaldo;
    }
}
