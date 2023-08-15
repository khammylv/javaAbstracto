package ejercicio5;
import ejercicio5.abstractas.ProductoElectronico;


public class Smartphone extends ProductoElectronico {
    private String sistemaOperativo;

    public Smartphone(String marca, String modelo, double precio, String sistemaOperativo) {
        super(marca, modelo, precio);
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Smartphone " + super.marca + " " + super.modelo);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
        System.out.println("Precio: $" + super.calcularPrecio());
    }
}