package nova;

public class Juridica extends Pessoa{
    private String cnpj;
    private String inscriaoEstadual;

    public Juridica(String nome, String telefone, String cnpj, String inscriaoEstadual) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscriaoEstadual = inscriaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscriaoEstadual() {
        return inscriaoEstadual;
    }

    public void setInscriaoEstadual(String inscriaoEstadual) {
        this.inscriaoEstadual = inscriaoEstadual;
    }

    @Override
    public String toString() {
        return "Juridica{" +
                "cnpj='" + cnpj + '\'' +
                ", inscriaoEstadual='" + inscriaoEstadual + '\'' +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
