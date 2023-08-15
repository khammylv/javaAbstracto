package ejercicio3;

public interface CuentaBancaria {
    void depositar(double cantidad);
    boolean retirar(double cantidad);
    double consultarSaldo();
}
