package banco;

import endereco.Endereco;

public class Funcionario {
    private String nome;
    private int CodFuncionario;
    private Endereco endereco;
    private String telefone;
    private String email;
    private ContaBancaria contaBancaria;
    private Associado associado;
    private Sexo sexo;
    private Setor setor;

    public Funcionario(String nome, int codFuncionario, Endereco endereco, String telefone, String email, ContaBancaria contaBancaria, Associado associado, Sexo sexo, Setor setor) {
        this.nome = nome;
        CodFuncionario = codFuncionario;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contaBancaria = contaBancaria;
        this.associado = associado;
        this.sexo = sexo;
        this.setor = setor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFuncionario() {
        return CodFuncionario;
    }

    public void setCodFuncionario(int codFuncionario) {
        CodFuncionario = codFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", CodFuncionario=" + CodFuncionario +
                ", endereco=" + endereco +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", contaBancaria=" + contaBancaria +
                ", associado=" + associado +
                ", sexo=" + sexo +
                ", setor=" + setor +
                '}';
    }
}
