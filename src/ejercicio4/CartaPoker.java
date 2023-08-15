package ejercicio4;

public class CartaPoker implements Carta {
    private String palo;
    private String valor;

    public CartaPoker(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    @Override
    public void mostrarCarta() {
        System.out.println(valor + " de " + palo);
    }

    @Override
    public int valorNumerico() {
       
        return 0;
    }
}