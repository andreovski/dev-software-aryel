package exEncapsulamento;

public class Termometro {
    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temp) {
        if (temp >= -273.15) {
            this.temperatura = temp;
        } else {
            System.out.println("Temperatura não pode ser inferior a -273.15°C (zero absoluto).");
        }
    }
}
