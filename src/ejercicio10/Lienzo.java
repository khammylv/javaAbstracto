package ejercicio10;

public class Lienzo {
    private Dibujable[] objetosDibujables;

    public Lienzo(Dibujable[] objetosDibujables) {
        this.objetosDibujables = objetosDibujables;
    }

    public void dibujarTodo() {
        for (Dibujable objeto : objetosDibujables) {
            objeto.dibujar();
        }
    }
}
