package pet;

public class Main {
    static void main() {
        Pet gato = new Pet("Gilde",12, "siames", "grande","comida");
        Cliente pes1 = new Cliente("Kaiqe", 43, gato);
        System.out.println(pes1);
    }
}
