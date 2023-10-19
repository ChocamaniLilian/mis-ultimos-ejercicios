package ejercicio2_10;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1= new Pedido("Ensalada", "Coca-Cola");
        Pedido pedido2= new Pedido("Sopa","Filete de Pollo","Agua Mineral ");
        Pedido pedido3= new Pedido("Pizza", "Papas Fritas", "Cerveza","Helado");

        double totalPedido1 = pedido1.calcularValorPedido();
        double totalPedido2 = pedido2.calcularValorPedido();
        double totalPedido3 = pedido3.calcularValorPedido();

        System.out.println("Valor del pedido 1: $" +totalPedido1);
        System.out.println("Valor del pedido 2: $" +totalPedido2);
        System.out.println("Valor del pedido 3: $" +totalPedido3);
    }
}
