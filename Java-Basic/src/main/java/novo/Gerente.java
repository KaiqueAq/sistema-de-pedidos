package novo;

import exmplo.Funcionario;

public class Gerente extends CargoDeConfinaca implements Contracacao{

    public Gerente(String nome, String cpf, String dataNascimento, double salrioBase, SalarioFinal salarioFinal, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salrioBase, salarioFinal, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {

    }

    @Override
    public void demitir(Funcionario funcionario) {

    }

    @Override
    public double obterSalarioFinal() {
        return 0;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salrioBase=" + salrioBase +
                ", salarioFinal=" + salarioFinal +
                '}';
    }
}
