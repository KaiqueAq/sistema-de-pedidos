package heranca2;

public class Memoria extends Componete{
    private int capDeAmazenamento;

    public Memoria(String marca, String modelo, int capDeAmazenamento) {
        super(marca, modelo);
        this.capDeAmazenamento = capDeAmazenamento;
    }

    public int getCapDeAmazenamento() {
        return capDeAmazenamento;
    }

    public void setCapDeAmazenamento(int capDeAmazenamento) {
        this.capDeAmazenamento = capDeAmazenamento;
    }

    @Override
    public String toString() {
        return "Memoria{" +
                "capDeAmazenamento=" + capDeAmazenamento +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
