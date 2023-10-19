package ejercicio2_11;

public class Main {
    public static void main(String[] args) {
        ArticuloCientifico ariculo1 = new ArticuloCientifico( "Einstein", "Galileo");
        ArticuloCientifico articulo2 = new ArticuloCientifico("La teoria del Todo", "Sthephen Howking","Ciencia", "2002",2023);
        ArticuloCientifico articulo3 = new ArticuloCientifico("El hombre que conocia el Infinito", "charles Darwin", "VGI", "256", 2002,"Resumen");


        Empleado empleado1= new Empleado();
        Empleado empleado2= new Empleado(101,"Juan","Perez",30);

        Caja caja1 = new Caja(10,5,3);
        Caja caja2 = new Caja ();
        Caja caja3= new Caja(8);
        Caja caja4 = new Caja (12,6,4,"Tipo 1");
    }
}
