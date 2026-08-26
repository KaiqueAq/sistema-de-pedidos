package banco;

public class ContaBancaria {
    private String nome;
    private int agencia;
    private double numeroDaconta;
    private String tipoDaConta;
    private double SaldoAtual;
    private String LimiteDisponivel;

    public ContaBancaria(String nome, int agencia, double numeroDaconta, String tipoDaConta, double saldoAtual, String limiteDisponivel) {
        this.nome = nome;
        this.agencia = agencia;
        this.numeroDaconta = numeroDaconta;
        this.tipoDaConta = tipoDaConta;
        SaldoAtual = saldoAtual;
        LimiteDisponivel = limiteDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getNumeroDaconta() {
        return numeroDaconta;
    }

    public void setNumeroDaconta(double numeroDaconta) {
        this.numeroDaconta = numeroDaconta;
    }

    public String getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(String tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

    public double getSaldoAtual() {
        return SaldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        SaldoAtual = saldoAtual;
    }

    public String getLimiteDisponivel() {
        return LimiteDisponivel;
    }

    public void setLimiteDisponivel(String limiteDisponivel) {
        LimiteDisponivel = limiteDisponivel;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "nome='" + nome + '\'' +
                ", agencia=" + agencia +
                ", numeroDaconta=" + numeroDaconta +
                ", tipoDaConta='" + tipoDaConta + '\'' +
                ", SaldoAtual=" + SaldoAtual +
                ", LimiteDisponivel='" + LimiteDisponivel + '\'' +
                '}';
    }
}
