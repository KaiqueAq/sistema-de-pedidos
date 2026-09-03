package Indutria;




public class Main {
    public static void main(String[] args) {
        // 1. Criando uma instância de Motoboy
        Motoboy motoboy = new Motoboy(
                "Carlos Silva",
                "15/05/1995",
                "67688787",
                Sexo.MASCULINO,
                2333,
                "30/14/1980",
                "30/14/1980",
                "AB"
        );

        // 2. Criando uma instância de Gerente (Cargo de Confiança com Bonificação de 30%)
        Gerente gerente = new Gerente(
                "Ana Souza",
                "987.654.321-11",
                "20/10/1988",
                Sexo.MASCULINO,
                2333,
                "30/14/1980",
                "30/14/1980",
                Bonificacao.Gerente
        );
        Diretor diretor = new Diretor(
                "Carlos",
                "887.754.931-11",
                "30/14/1980",
                Sexo.MASCULINO,
                2333,
                "30/14/1980",
                "30/14/1980",
                Bonificacao.Diretor
        );

        // 3. Exibindo os dados iniciais dos funcionários utilizando o toString()
        System.out.println("--- Dados dos Funcionários ---");
        System.out.println(motoboy);
        System.out.println();

        System.out.println(gerente);
        System.out.println("Salário Final do Gerente: R$ " + gerente.obterSalarioFinal());
        System.out.println();

        System.out.println(diretor);
        System.out.println("Salário Final do Gerente: R$ " + diretor.obterSalarioFinal());
        System.out.println();

        // 4. Testando os métodos da interface Contratacao implementados pelo Gerente
        System.out.println("--- Teste de Operações de Contratação (Interface Contratacao) ---");
        gerente.admitir(motoboy);
        gerente.demitir(motoboy);
    }
}

