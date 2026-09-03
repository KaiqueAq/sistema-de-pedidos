package Indutria;

public class Gerente extends CargoDeConfinaca implements Contracacao {


    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salrioBase, String dataNascimento, String dataAdmisao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salrioBase, dataNascimento, dataAdmisao, bonificacao);
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
        return super.salrioBase * bonificacao.getValor() ;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salrioBase=" + salrioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }
}




