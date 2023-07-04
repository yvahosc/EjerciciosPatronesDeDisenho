package co.com.MAKAIA.Ejercicio7;

public class MainEjercicio7 {

    public static void main(String[] args) {
        Credito credConsumo = FactoriaCreditos.crearCredito(
                "consumo",1000000);
        credConsumo.mostrarInformacionCredito();
        System.out.println("---------------------------");

        Credito credHipotecario = FactoriaCreditos.crearCredito(
                "hipotecario",2000000);
        credHipotecario.mostrarInformacionCredito();
        System.out.println("---------------------------");

        Credito credComercial = FactoriaCreditos.crearCredito(
                "hipotecario",0);

    }
}
