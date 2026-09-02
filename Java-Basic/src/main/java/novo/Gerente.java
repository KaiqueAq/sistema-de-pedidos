package novo;

import exmplo.Funcionario;

public class Gerente extends CargoDeConfinaca implements Contracacao{


    public Gerente(String nome, String cpf, String dataNascimento, double salrioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataNascimento, salrioBase, bonificacao);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir: " + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: " + funcionario.toString());
    }

    @Override
    public double obterSalarioFinal() {
        return super.salrioBase * bonificacao.Gerente.getValor();
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salrioBase=" + salrioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }
}
