package co.com.MAKAIA.Ejercicio6;

public class FactoriaNotificacion {
    public static Notificacion crearNotificacion(String tipoNotificacion,
                                                 String mensaje){
        if (tipoNotificacion == null) {
            throw new IllegalArgumentException("Tipo de notificación es null " +
                    "y no puede crearse un tipo de notificación no definido.");
        }

        switch (tipoNotificacion.toLowerCase()){
            case "correo":
                return new Correo(mensaje);
            case "mensaje de texto":
                return new MensajeDeTexto(mensaje);
            case "whatsapp":
                return new WhatsApp(mensaje);
            default:
                throw new IllegalArgumentException("Tipo de notificación: "
                        + tipoNotificacion + " no corresponde a las definidas" +
                        ".");
        }
    }
}
