package co.com.MAKAIA.Ejercicio4;

public abstract class Cafe {
    private String nombre;

    public Cafe(String nombre) {
        System.out.print("Preparando su " + nombre);
        this.nombre = nombre;
        System.out.println("...\nSu " + nombre + " está listo.");
    }

    public void tipoDeCafe() {
        System.out.println("Su Café es un: " + nombre + ".");
    }
}
