package novo;

public enum Bonificacao {
    Gerente(1.3),
    Diretor(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
