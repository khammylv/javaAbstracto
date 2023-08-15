package ejercicio2.abstractas;
import ejercicio2.Notificacion;

public abstract class NotificacionPush implements Notificacion {
    private String dispositivo;

    public NotificacionPush(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getDispositivo() {
        return dispositivo;
    }
}