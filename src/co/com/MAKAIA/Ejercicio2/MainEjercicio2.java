package co.com.MAKAIA.Ejercicio2;

public class MainEjercicio2 {

    public static void main(String[] args) {
        Reporte reporteExcel = FactoriaReporte.crearReporte("Reporte1 - " +
                "Excel","Excel");

        reporteExcel.generarReporte("Reporte de nómina");

        System.out.println("---------------------------");

        Reporte reporteWord = FactoriaReporte.crearReporte("Reporte1 - " +
                "Word", "Word");

        reporteWord.generarReporte("Reporte de ventas");

    }
}
