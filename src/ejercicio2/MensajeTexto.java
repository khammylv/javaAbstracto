package ejercicio2;
import ejercicio2.abstractas.NotificacionMensajeTexto;

public class MensajeTexto extends NotificacionMensajeTexto {
    private String mensaje;

    public MensajeTexto(String numeroDestino, String mensaje) {
        super(numeroDestino);
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando mensaje de texto a " + getNumeroDestino() + ": " + mensaje);
    }
}
