package banco;

import endereco.Endereco;

public class Main {
    static void main() {
        Endereco endereco1 = new Endereco("Rua Z", "33", "El Salvador");
        ContaBancaria con1 = new ContaBancaria("Master", 32323, 7836487, "Black", 232, "887");
        Funcionario fun1 = new Funcionario("kaique", 2, endereco1, "998989", "kaique@kfdklj",
                con1, Associado.PEDENTE, Sexo.MASCULINO, Setor.RECURSOS_HUMANOS);

        System.out.println(fun1);
    }

}
