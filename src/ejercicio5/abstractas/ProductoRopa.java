package ejercicio5.abstractas;
import ejercicio5.Producto;


public abstract class ProductoRopa implements Producto {
    protected String talla;
    protected String color;
    private double precio;

    public ProductoRopa(String talla, String color, double precio) {
        this.talla = talla;
        this.color = color;
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
