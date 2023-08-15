package ejercicio9;
import ejercicio9.abstracta.InstrumentoMusical;

public class Violin extends InstrumentoMusical {
    @Override
   public void tocar() {
        System.out.println("Tocando el violín: ¡Screeeeech!");
    }
}
