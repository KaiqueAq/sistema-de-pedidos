package modulo2;

import org.example.utili;

import java.util.Scanner;

public class CensoSocioeconômico {
    static void main() {
        double mediasalrial = 0;
        double somaSalarios = 0;
        int totalPessoas = 0;
        double mulheresSalarioAlto = 0;
        int maiordiade = 0;
        int menoridade = 999;
        double totalapagar = 0;
        Scanner ler = new Scanner(System.in);
        boolean rodando = true;
        while (rodando == true){
            System.out.println("------------------------------------");
            System.out.println("        Censo Socioeconômico        ");
            System.out.println("------------------------------------");
            System.out.println("[1]  Adicionar pessoa");
            System.out.println("[2]  Exibir resultados");
            System.out.println("[0] Sair");
            System.out.println("------------------------------------");
            System.out.println("Digite a opção desejada: ");

            int opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 1: {
                    totalapagar++;
                    utili.dimi();
                    System.out.println("Digite sua idade: ");
                    int idade = ler.nextInt();


                    if(idade >= 18) {
                        if (idade > maiordiade){
                            maiordiade = idade;
                        }
                        if (idade< menoridade){
                            menoridade = idade;
                        }
                        System.out.println("Qual seu Sexo(M / F): ");
                        String sexo = ler.next();
                        System.out.println("Qual o seu Salário: ");
                        double salario = ler.nextDouble();
                        somaSalarios = somaSalarios + salario;
                        mediasalrial = somaSalarios / totalPessoas;
                        if (sexo == "F" && salario >= 5.000){
                            mulheresSalarioAlto = salario;
                        }

                        ler.nextLine();
                        System.out.println("Registro incluído.Retornando ao menu...");
                        ler.nextLine();


                    }else {
                        System.out.println("não tem idade minima para entrar no senso");
                        ler.nextLine();
                        System.out.println("Pressione Enter para voltar...");
                        ler.nextLine();
                    }


                    break;

                }
                case 2:{
                    System.out.println("Média salarial do grupo"+ mediasalrial);

                    System.out.println(" Maior idade registrada: "+ maiordiade);
                    System.out.println(" Menor idade registrada: " + (menoridade == 999 ? 0 : menoridade));
                    System.out.println("Mulheres com salário ≥ R$ 5.000,00: "+ mulheresSalarioAlto);
                    ler.nextLine();
                    break;


                }
                case 0:{
                    rodando =false;
                    break;
                }
            }
        }
        System.out.println("Saindo...");
    }
}

