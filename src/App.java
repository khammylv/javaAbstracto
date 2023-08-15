import ejercicio1.Circulo;
import ejercicio1.Cuadrado;
import ejercicio1.Triangulo;
import ejercicio10.CirculoDibujo;
import ejercicio10.Dibujable;
import ejercicio10.Lienzo;
import ejercicio10.RectanguloDibujo;
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
import ejercicio6.Gato;
import ejercicio6.Pajaro;
import ejercicio6.Perro;
import ejercicio6.abstracta.Animal;
import ejercicio7.Circulo2;
import ejercicio7.Cuadrado2;
import ejercicio7.FormaGeometrica2;
import ejercicio7.Triangulo2;
import ejercicio8.EmpleadoAsalariado;
import ejercicio8.EmpleadoPorHoras;
import ejercicio8.abstracta.Empleado;
import ejercicio9.Guitarra;
import ejercicio9.Piano;
import ejercicio9.Violin;
import ejercicio9.abstracta.InstrumentoMusical;


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

        // Producto smartphone = new Smartphone("Samsung", "Galaxy S21", 999.99, "Android");
        // Producto camiseta = new Camiseta("M", "Negro", 19.99, "Algodón");

        // smartphone.mostrarDetalles();
        // System.out.println();

        // camiseta.mostrarDetalles();

        // Animal[] animales = new Animal[3];
        // animales[0] = new Perro();
        // animales[1] = new Gato();
        // animales[2] = new Pajaro();

        // for (Animal animal : animales) {
        //     animal.hacerSonido();
        // }


        // FormaGeometrica2[] formas = new FormaGeometrica2[3];
        // formas[0] = new Circulo2(5.0);
        // formas[1] = new Triangulo2(4.0, 7.0);
        // formas[2] = new Cuadrado2(6.0);

        // for (FormaGeometrica2 forma : formas) {
        //     forma.mostrarDetalles();
        //     double area = forma.calcularArea();
        //     System.out.println("Área: " + area);
        //     System.out.println();
        // }

        //  Empleado[] empleados = new Empleado[2];
        // empleados[0] = new EmpleadoAsalariado("Juan", 3000.0);
        // empleados[1] = new EmpleadoPorHoras("María", 15.0, 40);

        // for (Empleado empleado : empleados) {
        //     System.out.println("Empleado: " + empleado.getNombre());
        //     System.out.println("Salario: $" + empleado.calcularSalario());
        //     System.out.println();
        // }

    //      InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
    //     instrumentos[0] = new Guitarra();
    //     instrumentos[1] = new Piano();
    //     instrumentos[2] = new Violin();

    //     tocarTodos(instrumentos);
    // }

    // static void tocarTodos(InstrumentoMusical[] instrumentos) {
    //     for (InstrumentoMusical instrumento : instrumentos) {
    //         instrumento.tocar();
    //     }

     Dibujable[] objetosDibujables = new Dibujable[2];
        objetosDibujables[0] = new CirculoDibujo();
        objetosDibujables[1] = new RectanguloDibujo();

        Lienzo lienzo = new Lienzo(objetosDibujables);
        lienzo.dibujarTodo();

    }
}
