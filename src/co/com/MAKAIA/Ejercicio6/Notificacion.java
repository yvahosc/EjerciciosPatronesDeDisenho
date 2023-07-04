package co.com.MAKAIA.Ejercicio6;

public class Notificacion {
    private String tipo;
    private String mensaje;

    public Notificacion(String tipo, String mensaje) {
        this.tipo = tipo;
        this.mensaje = mensaje;
    }

    public void enviarNotificacion(){
        System.out.println("Notificación de tipo: " + tipo);
        System.out.println("Mensaje: " + mensaje);
    }
}
