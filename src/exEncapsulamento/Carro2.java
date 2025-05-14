package exEncapsulamento;

public class Carro2 {
    private String modelo;
    private int velocidade;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int valor) {
        if (valor > 0) {
            velocidade += valor;
        }
    }

    public void frear(int valor) {
        if (valor > 0) {
            velocidade -= valor;
            if (velocidade < 0) {
                velocidade = 0;
            }
        }
    }
}
