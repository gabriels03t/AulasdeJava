public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarPizza(new Pizza("Calabresa", 30.0));
        pedido.adicionarPizza(new Pizza("Margarita", 25.0));
        pedido.cancelarPedido();
        System.out.println("Valor Total do Pedido: R$" + pedido.calcularValorTotal());
    }
}
