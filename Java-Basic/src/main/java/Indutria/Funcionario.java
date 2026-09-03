package Indutria;



public abstract class Funcionario implements SalarioFinal {
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected  double salrioBase;
    protected String dataNascimento;
    protected String dataAdmisao    ;


    public Funcionario(String nome, String cpf, String rg, Sexo sexo, double salrioBase, String dataNascimento, String dataAdmisao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.salrioBase = salrioBase;
        this.dataNascimento = dataNascimento;
        this.dataAdmisao = dataAdmisao;
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

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public double getSalrioBase() {
        return salrioBase;
    }

    public void setSalrioBase(double salrioBase) {
        this.salrioBase = salrioBase;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataAdmisao() {
        return dataAdmisao;
    }

    public void setDataAdmisao(String dataAdmisao) {
        this.dataAdmisao = dataAdmisao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salrioBase=" + salrioBase +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", dataAdmisao='" + dataAdmisao + '\'' +
                '}';
    }
}
