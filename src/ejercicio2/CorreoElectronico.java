package ejercicio2;
import ejercicio2.abstractas.NotificacionCorreo;

public class CorreoElectronico extends NotificacionCorreo {
    private String contenido;

    public CorreoElectronico(String destinatario, String contenido) {
        super(destinatario);
        this.contenido = contenido;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando correo a " + getDestinatario() + ": " + contenido);
    }
}
