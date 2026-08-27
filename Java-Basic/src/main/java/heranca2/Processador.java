package heranca2;

public class Processador extends Componete{
    private String frequecia;

    public Processador(String marca, String modelo, String frequecia) {
        super(marca, modelo);
        this.frequecia = frequecia;
    }

    public String getFrequecia() {
        return frequecia;
    }

    public void setFrequecia(String frequecia) {
        this.frequecia = frequecia;
    }

    @Override
    public String toString() {
        return "Processador{" +
                "frequecia='" + frequecia + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
