import exEncapsulamento.Aluno;
import exEncapsulamento.Livro;
import exEncapsulamento.Pessoa;
import exEncapsulamento.Produto;
import exEncapsulamento.Termometro;
import exEncapsulamento.Carro2;
import exInstancias.Carro;
import exInstancias.ContaBancaria;
import exInstancias.Jogador;
import exInstancias.Lampada;

public class App {
    public static void main(String[] args) throws Exception {
        //📘 Lista de Exercícios – Java: Classes, Atributos, Métodos e Construtores

        // 1. Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);

        carro1.exibirInfo();
        carro2.exibirInfo();

        System.out.println("-------------------------------");

        // 2. Lâmpada
        Lampada lampada = new Lampada("Branca");

        lampada.mostrarEstado();
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();

        System.out.println("-------------------------------");

        // 3. Conta Bancária
        ContaBancaria conta = new ContaBancaria("João");

        conta.depositar(500);
        conta.mostrarSaldo();
        conta.sacar(200);
        conta.mostrarSaldo();
        conta.sacar(400);
        conta.mostrarSaldo();

        System.out.println("-------------------------------");

        // 4. Jogo de Aventura
        Jogador jogador1 = new Jogador("Arthur", 100, 30);
        Jogador jogador2 = new Jogador("Bruno", 80, 20);

        System.out.println("Status antes do ataque:");
        jogador1.mostrarStatus();
        jogador2.mostrarStatus();

        jogador1.atacar(jogador2);

        System.out.println("\nStatus depois do ataque:");
        jogador1.mostrarStatus();
        jogador2.mostrarStatus();
        
        System.out.println("-------------------------------");

        
        //📘 Lista de Exercícios – Encapsulamento em Java

        // 1. Pessoa
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Ana");
        pessoa.setIdade(25);
        pessoa.setIdade(-5); // Testando idade inválida
        System.out.println("Pessoa: " + pessoa.getNome() + ", Idade: " + pessoa.getIdade());

        System.out.println("-------------------------------");

        // 2. Produto
        Produto produto = new Produto();
        produto.setNome("Camiseta");
        produto.setPreco(59.90);
        produto.setPreco(-10); // Preço inválido
        System.out.println("Produto: " + produto.getNome() + ", Preço: R$" + produto.getPreco());

        System.out.println("-------------------------------");

        // 3. Termômetro
        Termometro termometro = new Termometro();
        termometro.setTemperatura(25.5);
        termometro.setTemperatura(-300); 
        System.out.println("Temperatura atual: " + termometro.getTemperatura() + "°C");

        System.out.println("-------------------------------");

        // 4. Aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Carlos");
        aluno.setNota(7.5);
        aluno.setNota(12);
        System.out.println("Aluno: " + aluno.getNome() + ", Nota: " + aluno.getNota());
        System.out.println("Aprovado? " + (aluno.aprovado() ? "Sim" : "Não"));

        System.out.println("-------------------------------");

        // 5. Carro
        Carro2 carro = new Carro2();
        carro.setModelo("Fusca");
        carro.acelerar(60);
        carro.frear(30);
        carro.frear(50);
        System.out.println("Carro: " + carro.getModelo() + ", Velocidade: " + carro.getVelocidade() + "km/h");

        System.out.println("-------------------------------");

        // 6. Livro
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1000);
        livro.ler(40);
        livro.ler(900);
        System.out.println("Livro: " + livro.getTitulo() + " de " + livro.getAutor());
        System.out.println("Progresso de leitura: " + livro.progresso() + "%");
    }
}
