package novo;

public class Motoboy extends Funcionario{
    private String placaDaMoto;

    public Motoboy(String nome, String cpf, String dataNascimento, double salrioBase, String placaDaMoto) {
        super(nome, cpf, dataNascimento, salrioBase);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }

    @Override
    public double obterSalarioFinal() {
        return this.salrioBase;
    }

    @Override
    public String toString() {
        return "Motoboy{" +
                "placaDaMoto='" + placaDaMoto + '\'' +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salrioBase=" + salrioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }
}
