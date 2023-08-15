package ejercicio5.abstractas;
import ejercicio5.Producto;

public abstract class ProductoElectronico implements Producto {
    protected String marca;
    protected String modelo;
    private double precio;

    public ProductoElectronico(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
