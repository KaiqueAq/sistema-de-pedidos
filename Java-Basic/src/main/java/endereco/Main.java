package endereco;

public class Main {
    static void main() {
        Endereco endereco1 = new Endereco("Rua Z", "33", "El Salvador");
        Cliente pes1 = new Cliente("Kaique", 21, endereco1);

        System.out.println("Cliente: "+ pes1);
        System.out.println("Endereço: "+endereco1);
    }
}
