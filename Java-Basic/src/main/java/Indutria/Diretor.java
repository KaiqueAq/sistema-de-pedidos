package Indutria;

public class Diretor extends CargoDeConfinaca implements Contracacao {
    private final double PREMIO = 1.1;

    public Diretor(String nome, String cpf, String rg, Sexo sexo, double salrioBase, String dataNascimento, String dataAdmisao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salrioBase, dataNascimento, dataAdmisao, bonificacao);
    }


    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir: " + funcionario.toString());
    }

    @Override
    public double obterSalarioFinal() {
        return super.salrioBase * bonificacao.getValor();
    }

    @Override
    public String toString() {
        return "Diretor{" +
                "PREMIO=" + PREMIO +
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

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: " + funcionario.toString());
    }
}
