package ejercicio5;
import ejercicio5.abstractas.ProductoRopa;

public class Camiseta extends ProductoRopa {
    private String material;

    public Camiseta(String talla, String color, double precio, String material) {
        super(talla, color, precio);
        this.material = material;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Camiseta " + super.color + " talla " + super.talla);
        System.out.println("Material: " + material);
        System.out.println("Precio: $" + super.calcularPrecio());
    }
}
