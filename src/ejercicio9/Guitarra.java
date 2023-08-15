package ejercicio9;
import ejercicio9.abstracta.InstrumentoMusical;


public class Guitarra extends InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando la guitarra: ¡Tchun tchun tchun!");
    }
}
