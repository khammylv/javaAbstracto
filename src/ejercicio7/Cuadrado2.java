package ejercicio7;

public class Cuadrado2 implements FormaGeometrica2 {
    private double lado;

    public Cuadrado2(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cuadrado - Lado: " + lado);
    }
}
