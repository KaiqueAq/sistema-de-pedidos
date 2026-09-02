package exmplo;

public class Main {
    static void main() {
        Motoboy moto = new Motoboy(
                "Job",
                "12/02/2008",
                Sexo.MASCULINO,
                Setor.RECURSOS_HUMANOS,
                3000,
                "A");
        Diretor diretor = new Diretor(
                "Carol",
                "12/04/2006",
                Sexo.FEMININO,
                Setor.OPERACOES,
                22222);

        System.out.println(diretor.toString());
        diretor.admitir(moto);
    }

}
