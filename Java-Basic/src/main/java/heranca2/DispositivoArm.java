package heranca2;

public class DispositivoArm extends Componete{
    private String capacidadeArm;
    private String tipodeConex;

    public DispositivoArm(String marca, String modelo, String capacidadeArm, String tipodeConex) {
        super(marca, modelo);
        this.capacidadeArm = capacidadeArm;
        this.tipodeConex = tipodeConex;
    }

    public String getCapacidadeArm() {
        return capacidadeArm;
    }

    public void setCapacidadeArm(String capacidadeArm) {
        this.capacidadeArm = capacidadeArm;
    }

    public String getTipodeConex() {
        return tipodeConex;
    }

    public void setTipodeConex(String tipodeConex) {
        this.tipodeConex = tipodeConex;
    }

    @Override
    public String toString() {
        return "DispositivoArm{" +
                "capacidadeArm='" + capacidadeArm + '\'' +
                ", tipodeConex='" + tipodeConex + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
