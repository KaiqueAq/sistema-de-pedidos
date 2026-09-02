package novo;

public abstract class CargoDeConfinaca extends Funcionario{
    protected Bonificacao bonificacao;

    public CargoDeConfinaca(String nome, String cpf, String dataNascimento, double salrioBase, SalarioFinal salarioFinal, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salrioBase, salarioFinal);
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
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salrioBase=" + salrioBase +
                ", salarioFinal=" + salarioFinal +
                '}';
    }
}
