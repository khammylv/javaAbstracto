package ejercicio3.abstractas;
import ejercicio3.CuentaBancaria;


public abstract class CuentaBase implements CuentaBancaria {
    private String titular;
    protected double saldo;

    public CuentaBase(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    @Override
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito de " + cantidad + " realizado en la cuenta de " + titular);
        } else {
            System.out.println("El depósito debe ser mayor que 0.");
        }
    }

    @Override
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro de " + cantidad + " realizado de la cuenta de " + titular);
            return true;
        } else {
            System.out.println("No es posible realizar el retiro.");
            return false;
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}
