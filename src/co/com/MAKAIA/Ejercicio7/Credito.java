package co.com.MAKAIA.Ejercicio7;

public class Credito {
    private String tipo;
    private int valor;

    public Credito(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public void mostrarInformacionCredito() {
        System.out.println("Crédito: tipo: " + tipo + ", valor: $" + valor +
                ".");
    }
}
