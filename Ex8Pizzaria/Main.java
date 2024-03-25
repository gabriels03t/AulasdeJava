import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pizza> menuPizzas = new ArrayList<>();
        menuPizzas.add(new Pizza("Calabresa", 30.0, "Calabresa, queijo, molho de tomate"));
        menuPizzas.add(new Pizza("Margarita", 25.0, "Mussarela, tomate, manjericão"));

        Pedido pedido = new Pedido();
        
        System.out.println("Bem-vindo à Pizzaria! Por favor, faça seu pedido:");
        while (true) {
            System.out.println("Escolha uma pizza pelo número:");
            for (int i = 0; i < menuPizzas.size(); i++) {
                System.out.println((i + 1) + ". " + menuPizzas.get(i));
            }
            System.out.println("0. Encerrar Pedido");
            int escolha = scanner.nextInt();
            if (escolha == 10) {
                break;
            } else if (escolha > 0 && escolha <= menuPizzas.size()) {
                pedido.adicionarPizza(menuPizzas.get(escolha - 1));
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        System.out.println("Valor Total do Pedido: R$" + pedido.calcularValorTotal());
        pedido.gerarRelatorio();
        
        scanner.close();
    }
}