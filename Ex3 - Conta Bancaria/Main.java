public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(123456, "João", 1000.0);
        ContaBancaria conta2 = new ContaBancaria(789012, "Maria", 2000.0);

        conta1.exibirInfo();
        System.out.println();
        conta2.exibirInfo();
    }
}
