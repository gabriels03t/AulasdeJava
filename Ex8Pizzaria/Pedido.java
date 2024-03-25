import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Pizza> pizzas = new ArrayList<>();

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void gerarRelatorio() {
    System.out.println("\nRelatório de Pedidos:");
    System.out.println("Total de Pedidos Realizados: " + pizzas.size());
    if (!pizzas.isEmpty()) {
        double total = calcularValorTotal();
        double media = total / pizzas.size();
        System.out.println("Valor Total dos Pedidos: R$" + total);
        System.out.println("Média de Preço dos Pedidos: R$" + media);
    }
}
    public double calcularValorTotal() {
        return pizzas.stream().mapToDouble(Pizza::getValor).sum();
    }
}