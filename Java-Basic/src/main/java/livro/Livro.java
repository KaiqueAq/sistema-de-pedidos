package livro;

public class Livro {
    private String nome;
    private String autor;
    private double preco;
    private int numeroDePagina;

    public Livro(String nome, String autor, double preco, int numeroDePagina) {
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.numeroDePagina = numeroDePagina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(int numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }
}
