package Indutria;

public abstract class CargoDeConfinaca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfinaca(String nome, String cpf, String rg, Sexo sexo, double salrioBase, String dataNascimento, String dataAdmisao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salrioBase, dataNascimento, dataAdmisao);
        this.bonificacao = bonificacao;
    }


    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "CargoDeConfinaca{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salrioBase=" + salrioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                '}';
    }
}
