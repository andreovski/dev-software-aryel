package exInstancias;

public class Jogador {
    private String nome;
    private int vida;
    private int forca;

    // Construtor
    public Jogador(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public void atacar(Jogador outroJogador) {
        System.out.println(nome + " atacou " + outroJogador.nome + " causando " + forca + " de dano.");
        outroJogador.vida = outroJogador.vida - forca;
        
        if (outroJogador.vida < 0) outroJogador.vida = 0;
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome + " | Vida: " + vida + " | Força: " + forca);
    }
}