package co.com.MAKAIA.Ejercicio7;

public class FactoriaCreditos {

    public static Credito crearCredito(String tipoCredito,
                                                 int valorCredito){

        if (tipoCredito == null) {
            throw new IllegalArgumentException("Tipo de crédito es null " +
                    "y no puede crearse un tipo de crédito no definido.");
        }

        if (valorCredito <= 0) {
            throw new IllegalArgumentException("El valor del crédito debe ser" +
                    " mayor a cero.");
        }

        switch (tipoCredito.toLowerCase()){
            case "consumo":
                return new CreditoConsumo(valorCredito);
            case "comercial":
                return new CreditoComercial(valorCredito);
            case "hipotecario":
                return new CreditoHipotecario(valorCredito);
            default:
                throw new IllegalArgumentException("Tipo de crédito: "
                        + tipoCredito + " no corresponde a los definidos.");
        }
    }
}
