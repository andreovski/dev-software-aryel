package exInstancias;

public class ContaBancaria {
    private String titular;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println(titular + " depositou R$" + valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println(titular + " sacou R$" + valor);
        } else {
            System.out.println("Saldo insuficiente para " + titular);
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": R$" + saldo);
    }
}