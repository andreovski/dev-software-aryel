package exInstancias;

public class Lampada {
    private String cor;
    private boolean ligada;

    // Construtor
    public Lampada(String cor) {
        this.cor = cor;
        this.ligada = false; // por padrão desligada
    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada " + cor + " está LIGADA.");
        } else {
            System.out.println("A lâmpada " + cor + " está DESLIGADA.");
        }
    }
}