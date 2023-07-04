package co.com.MAKAIA.Ejercicio4;


public class Maquina {

    public static Cafe prepararCafe(String tipoCafe){
        if (tipoCafe == null) {
            throw new IllegalArgumentException("Tipo de café es null y no " +
                    "puede prepararse un tipo de café no definido.");
        }

        switch (tipoCafe.toLowerCase()){
            case "americano":
                return new Americano();
            case "cappuccino":
                return new Cappuccino();
            case "caffelatte":
                return new Caffelatte();
            case "espresso":
                return new Espresso();
            default:
                throw new IllegalArgumentException("Tipo de café: "
                        + tipoCafe + " no corresponde a los definidos.");
        }
    }
}
