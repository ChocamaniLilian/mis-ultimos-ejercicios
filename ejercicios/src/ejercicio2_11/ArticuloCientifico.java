package ejercicio2_11;

public class ArticuloCientifico {
    private String titulo;
    private String autor;
    private  String palabrasClaves;
    private  String nombrePublicacion;
    private int año;
    private String resumen;

    public ArticuloCientifico(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public ArticuloCientifico (String titulo, String autor,String palabrasClaves, String nombrePublicacion, int año){
        this(titulo,autor);
        this.palabrasClaves = palabrasClaves;
        this.nombrePublicacion=nombrePublicacion;
        this.año=año;
    }
    public ArticuloCientifico (String titulo, String autor,String palabrasClaves, String nombrePublicacion, int año, String resumen){
        this(titulo,autor,palabrasClaves,nombrePublicacion,año);
        this.resumen= resumen;
    }
}
class Empleado {
    private int identificador;
    private String  nombre;
    private String apellidos;
    private int edad;

    public Empleado(){
        this.identificador = 100;
        this.nombre= "Nuevo Empleado";
        this.apellidos= "Nuevo Empleado";
        this.edad=18;
    }
    public Empleado (int identificador, String nombre,String apellidos, int edad){
        this.identificador=identificador;
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.edad= edad;
    }
}
class Caja {
    private double longitudBase;
    private double anchura;
    private double altura;
    private String tipoCaja;

    public Caja (double longitudBase, double anchura, double altura){
        this.longitudBase= longitudBase;
        this.anchura= anchura;
        this.altura=altura;
    }
    public Caja (){
        this.longitudBase = 0;
        this.anchura = 0;
        this.altura = 0;
    }
    public Caja (double longitud){
        this(longitud,longitud,longitud);
    }
    public Caja (double longitudBase, double anchura, double altura, String tipoCaja){
        this(longitudBase,anchura,altura);
        this.tipoCaja=tipoCaja;
    }
}
