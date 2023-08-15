package ejercicio3;
import ejercicio3.abstractas.CuentaBase;


public class CuentaAhorro extends CuentaBase {
    private double tasaInteres;

    public CuentaAhorro(String titular, double saldoInicial, double tasaInteres) {
        super(titular, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }
}