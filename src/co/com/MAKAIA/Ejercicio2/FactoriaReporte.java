package co.com.MAKAIA.Ejercicio2;

public class FactoriaReporte {
    public static Reporte crearReporte(String nombre, String tipoReporte){

        if (tipoReporte == null) {
            throw new IllegalArgumentException("Tipo de reporte es null y no " +
                    "puede instanciarse ninguna de los reportes definidos.");
        }

        switch (tipoReporte.toLowerCase()){
            case "excel":
                return new Excel(nombre);
            case "pdf":
                return new Pdf(nombre);
            case "word":
                return new Word(nombre);
            case "texto plano":
                return new TextoPlano(nombre);
            default:
                throw new IllegalArgumentException("Tipo de reporte: "
                        + tipoReporte + " no corresponde a los definidos.");
        }
    }
}
