package matematica;

public class Main {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Mutipicacao multiplicacao = new Mutipicacao();
        Divisao divisao = new Divisao();
        Subtracao subtracao = new Subtracao();


        System.out.println("Soma (10 + 5): \n R: " + soma.calcular(10, 5));
        System.out.println("Subtração (10 - 5): \n R:" + subtracao.calcular(10, 5));
        System.out.println("Multiplicação (10 * 5): \n R:" + multiplicacao.calcular(10, 5));
        System.out.println("Divisão (10 / 5): \n R:" + divisao.calcular(10, 5));
    }
}
