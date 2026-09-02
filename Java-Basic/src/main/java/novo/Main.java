package novo;

import exmplo.Diretor;
import exmplo.Motoboy;
import exmplo.Setor;
import exmplo.Sexo;
public class Main {
    public static void main(String[] args) {
        // 1. Criando uma instância de Motoboy
        Motoboy motoboy = new Motoboy(
                "Carlos Silva",
                "15/05/1995",
                Sexo.MASCULINO,
                Setor.FINANCEIRO,
                2112,
                "ABC-1234"
        );

        // 2. Criando uma instância de Gerente (Cargo de Confiança com Bonificação de 30%)
        Gerente gerente = new Gerente(
                "Ana Souza",
                "987.654.321-11",
                "20/10/1988",
                62000.0,
                Bonificacao.Gerente
        );
        Gerente diretor = new Gerente(
                "Carlos",
                "887.754.931-11",
                "30/14/1980",
                69000.0,
                Bonificacao.Diretor
        );

        // 3. Exibindo os dados iniciais dos funcionários utilizando o toString()
        System.out.println("--- Dados dos Funcionários ---");
        System.out.println(motoboy.toString());
        System.out.println("Salário Final do Motoboy: R$ " + motoboy.getSalarioFinal());
        System.out.println();

        System.out.println(gerente.toString());
        System.out.println("Salário Final do Gerente: R$ " + gerente.obterSalarioFinal());
        System.out.println();

        System.out.println(diretor.toString());
        System.out.println("Salário Final do Gerente: R$ " + diretor.obterSalarioFinal());
        System.out.println();

        // 4. Testando os métodos da interface Contratacao implementados pelo Gerente
        System.out.println("--- Teste de Operações de Contratação (Interface Contratacao) ---");
        gerente.admitir(motoboy);
        gerente.demitir(motoboy);
    }
}

