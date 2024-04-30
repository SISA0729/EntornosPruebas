package zzz;

public class EJERCICIO2 {
    public static String getHouseMeaning(String house) {
        switch (house.toLowerCase()) {
            case "gryffindor":
                return "valentía";
            case "hufflepuff":
                return "lealtad";
            case "slytherin":
                return "astucia";
            case "ravenclaw":
                return "intelecto";
            default:
                return "no es una casa válida";
        }
    }
}
