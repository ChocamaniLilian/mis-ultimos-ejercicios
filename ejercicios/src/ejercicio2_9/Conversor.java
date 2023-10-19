package ejercicio2_9;

public class Conversor {
    public static double metrosACentimetros(double metros){
        return  metros *100;
    }
    public static double metrosAMilimetros (double metros){
        return metros * 1000;
    }
    public static double metrosAPulgadas (double metros){
        return metros *39.37;
    }
    public static double metrosAPies(double metros){
        return metros * 3.281;
    }
    public static double metrosAYardas(double metros){
        return metros * 1.094;
    }
    public static double areasAHectarias(double areas){
        return areas / 10000;
    }
    public static double areasAKilometrosCuadrados (double areas){
        return areas / 1000000;
    }
    public static double areasAFanegas (double areas){
        return areas / 6460;
    }
    public static double areasAAcress (double areas){
        return areas /4046.85;
    }
    public static double litrosAGalones(double litros){
        return litros / 4.41;
    }
    public static double litrosAPintas (double litros){
        return litros / 0.46;
    }
    public static double litrosABarriles (double litros){
        return litros / 159.99;
    }
    public static double litrosAMetrosCubicos(double litros){
        return litros / 1000;
    }
    public static double litrosAHectolitros(double litros){
        return litros / 100;
    }
}
