package co.com.MAKAIA.Ejercicio6;


public class MainEjercicio6 {

    public static void main(String[] args) {
        Notificacion notifCorreo = FactoriaNotificacion.crearNotificacion(
                "Correo","Notificación de correo");

        notifCorreo.enviarNotificacion();

        System.out.println("---------------------------");

        Notificacion notifWp = FactoriaNotificacion.crearNotificacion(
                "WhatsApp","Notificación de WhatsApp");

        notifWp.enviarNotificacion();

    }
}
