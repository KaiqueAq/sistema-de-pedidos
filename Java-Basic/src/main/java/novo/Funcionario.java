package novo;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected String cpf;
    protected String dataNascimento;
    protected  double salrioBase;


    public Funcionario(String nome, String cpf, String dataNascimento, double salrioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.salrioBase = salrioBase;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSalrioBase() {
        return salrioBase;
    }

    public void setSalrioBase(double salrioBase) {
        this.salrioBase = salrioBase;
    }



    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", salrioBase=" + salrioBase +
                ", salarioFinal=" +  +
                '}';
    }
}
