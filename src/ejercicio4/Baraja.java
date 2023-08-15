package ejercicio4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        String[] valores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String palo : palos) {
            for (String valor : valores) {
                cartas.add(new CartaPoker(palo, valor));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.remove(0);
        }
        return null;
    }
}
