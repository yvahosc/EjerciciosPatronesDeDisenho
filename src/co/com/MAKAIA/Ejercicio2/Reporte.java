package co.com.MAKAIA.Ejercicio2;

public class Reporte {
    private String nombre;
    private String formato;

    public Reporte(String nombre, String formato) {
        this.nombre = nombre;
        this.formato = formato;
    }

    public void generarReporte(String informacion){
        System.out.println("Reporte: " + nombre + "\nContenido: " + informacion
                + "\nFormato: " + formato + ".");
    }
}
