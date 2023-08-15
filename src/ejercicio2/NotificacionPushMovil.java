package ejercicio2;
import ejercicio2.abstractas.NotificacionPush;


public class NotificacionPushMovil extends NotificacionPush {
    private String mensaje;

    public NotificacionPushMovil(String dispositivo, String mensaje) {
        super(dispositivo);
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación push a " + getDispositivo() + ": " + mensaje);
    }
}
