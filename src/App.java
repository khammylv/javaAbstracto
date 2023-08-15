import ejercicio1.Circulo;
import ejercicio1.Cuadrado;
import ejercicio1.Triangulo;
//import ejercicio2.Notificacion;
import ejercicio2.CorreoElectronico;
import ejercicio2.MensajeTexto;
import ejercicio2.Notificacion;
import ejercicio2.NotificacionPushMovil;
import ejercicio3.CuentaAhorro;
import ejercicio3.CuentaCorriente;
import ejercicio4.Baraja;
import ejercicio4.Carta;
import ejercicio5.Camiseta;
import ejercicio5.Producto;
import ejercicio5.Smartphone;


public class App {
    public static void main(String[] args) throws Exception {
        //   Circulo circulo = new Circulo(5);
        // Triangulo triangulo = new Triangulo(3, 4, 5);
        // Cuadrado cuadrado = new Cuadrado(6);

        // System.out.println("Área del círculo: " + circulo.calcularArea());
        // System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        // System.out.println("Área del triángulo: " + triangulo.calcularArea());
        // System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());

        // System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        // System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
    
        // Notificacion correo = new CorreoElectronico("destinatario@example.com", "Contenido del correo");
        // Notificacion mensaje = new MensajeTexto("+123456789", "Mensaje de texto");
        // Notificacion push = new NotificacionPushMovil("Dispositivo Android", "Notificación push importante");

        // correo.enviar();
        // mensaje.enviar();
        // push.enviar();
    
        
        // CuentaAhorro cuentaAhorro = new CuentaAhorro("Juan", 1000, 0.05);
        // CuentaCorriente cuentaCorriente = new CuentaCorriente("Maria", 2000, 500);

        // cuentaAhorro.depositar(500);
        // cuentaAhorro.retirar(200);
        // System.out.println("Saldo de la cuenta de ahorro: " + cuentaAhorro.consultarSaldo());

        // cuentaCorriente.depositar(800);
        // cuentaCorriente.retirar(2700);
        // System.out.println("Saldo de la cuenta corriente: " + cuentaCorriente.consultarSaldo());
       

        //  Baraja baraja = new Baraja();
        // baraja.barajar();

        // for (int i = 0; i < 5; i++) {
        //     Carta carta = baraja.repartirCarta();
        //     if (carta != null) {
        //         carta.mostrarCarta();
        //     } else {
        //         System.out.println("No hay más cartas en la baraja.");
        //     }
        // }

        Producto smartphone = new Smartphone("Samsung", "Galaxy S21", 999.99, "Android");
        Producto camiseta = new Camiseta("M", "Negro", 19.99, "Algodón");

        smartphone.mostrarDetalles();
        System.out.println();

        camiseta.mostrarDetalles();

    }
}
