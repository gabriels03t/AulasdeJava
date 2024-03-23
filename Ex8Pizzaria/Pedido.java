import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas = new ArrayList<>();
    private String enderecoEntrega;

    public void adicionarPizza(Pizza pizza) { pizzas.add(pizza); }

    public void cancelarPedido() { pizzas.clear(); enderecoEntrega = null; }

    public double calcularValorTotal() {
        return pizzas.stream().mapToDouble(Pizza::getValor).sum();
    }
}
