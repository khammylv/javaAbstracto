package ejercicio7;

public class Triangulo2 implements FormaGeometrica2 {
    private double base;
    private double altura;

    public Triangulo2(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Triángulo - Base: " + base + ", Altura: " + altura);
    }
}
