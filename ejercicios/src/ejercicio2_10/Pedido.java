package ejercicio2_10;

public class Pedido {
    private String primerPlato;
    private String segundoPlato;
    private String bebida;
    private String postre;

    public Pedido(String primerPlato,String bebida){
        this.primerPlato=primerPlato;
        this.bebida=bebida;
    }
    public  Pedido (String primerPlato,String segundoPlato,String bebida) {
        this.primerPlato = primerPlato;
        this.segundoPlato = segundoPlato;
        this.bebida = bebida;
    }
    public Pedido(String primerPlato,String segundoPlato,String bebida,String postre){
        this.primerPlato=primerPlato;
        this.segundoPlato=segundoPlato;
        this.bebida=bebida;
        this.postre=postre;
    }
    public double calcularValorPedido() {
        double valorTotal = 0.0;
        return valorTotal;
    }
}
