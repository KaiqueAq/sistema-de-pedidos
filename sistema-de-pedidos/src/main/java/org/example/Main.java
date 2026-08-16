package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double totalapagar = 0;
        Scanner ler = new Scanner(System.in);
        boolean rodando = true;
        while (rodando == true){
            System.out.println("------------------------------------");
            System.out.println("        Sistema de Pedidos          ");
            System.out.println("------------------------------------");
            System.out.println("[1] Picanha         - R$ 25,00");
            System.out.println("[2] Lasanha         - R$ 20,00");
            System.out.println("[3] Strogonoff      - R$ 18,00");
            System.out.println("[4] Bife acebolado  - R$ 15,00");
            System.out.println("[5] Pão com ovo     - R$ 5,00");
            System.out.println("[0] Sair");
            System.out.println("------------------------------------");
            System.out.println("Digite a opção desejada: ");

            int opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 1: {
                    utili.dimi();
                    System.out.println("add Picanha R$ 25,00");
                    totalapagar = totalapagar +25;
                    System.out.println("Pressione Enter para continuar...");
                    ler.nextLine();
                    break;



                }
                case 2:{
                    utili.dimi();
                    System.out.println("add Lasanha R$ 20,00");
                    totalapagar = totalapagar +20;
                    System.out.println("Pressione Enter para continuar...");
                    ler.nextLine();
                    break;


                }
                case 3:{
                    utili.dimi();
                    System.out.println("add Strogonoff R$ 18,00");
                    totalapagar = totalapagar +18;
                    System.out.println("Pressione Enter para continuar...");
                    ler.nextLine();
                    break;

                }
                case 4:{
                    utili.dimi();
                    System.out.println("add Bife acebolado R$ 15,00");
                    totalapagar = totalapagar +15;
                    System.out.println("Pressione Enter para continuar...");
                    ler.nextLine();
                    break;
                }case 5:{
                    utili.dimi();
                    System.out.println("add Pão com ovo R$ 5,00");
                    totalapagar = totalapagar +5;
                    System.out.println("Pressione Enter para continuar...");
                    ler.nextLine();
                    break;
                }
                case 0:{
                    rodando =false;
                    break;
                }
            }
        }
        System.out.println("total a pagar: "+ totalapagar);
    }


}
