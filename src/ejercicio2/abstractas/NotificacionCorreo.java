package ejercicio2.abstractas;
import ejercicio2.Notificacion;

public abstract class NotificacionCorreo implements Notificacion {
    private String destinatario;

    public NotificacionCorreo(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getDestinatario() {
        return destinatario;
    }
}
