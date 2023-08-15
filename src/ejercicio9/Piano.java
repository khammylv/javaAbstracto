package ejercicio9;
import ejercicio9.abstracta.InstrumentoMusical;

public class Piano extends InstrumentoMusical {
    @Override
   public void tocar() {
        System.out.println("Tocando el piano: ¡Ding dong ding!");
    }
}
