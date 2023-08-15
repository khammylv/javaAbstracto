package ejercicio2.abstractas;
import ejercicio2.Notificacion;

public abstract class NotificacionMensajeTexto implements Notificacion {
    private String numeroDestino;

    public NotificacionMensajeTexto(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }
}
