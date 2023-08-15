package ejercicio7;

public class Circulo2 implements FormaGeometrica2 {
    private double radio;

    public Circulo2(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Círculo - Radio: " + radio);
    }
}
