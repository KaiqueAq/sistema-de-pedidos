package Indutria;

public class Motoboy extends Funcionario {
    private String cnh;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salrioBase, String dataNascimento, String dataAdmisao, String cnh) {
        super(nome, cpf, rg, sexo, salrioBase, dataNascimento, dataAdmisao);
        this.cnh = cnh;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }


    @Override
    public String toString() {
        return "Motoboy{" +
                "cnh='" + cnh + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salrioBase=" + salrioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                '}';
    }


    @Override
    public double obterSalarioFinal() {
        return super.salrioBase;
    }
}
