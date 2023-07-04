package co.com.MAKAIA.Ejercicio4;

public class MainEjercicio4 {

    public static void main(String[] args) {
        Cafe cafe1 = Maquina.prepararCafe("Americano");
        cafe1.tipoDeCafe();
        System.out.println("--------------------");

        Cafe cafe2 = Maquina.prepararCafe("Cappuccino");
        cafe2.tipoDeCafe();
        System.out.println("--------------------");

        Cafe cafe3 = Maquina.prepararCafe("Espresso");
        cafe3.tipoDeCafe();
        System.out.println("--------------------");

        Cafe cafe4 = Maquina.prepararCafe("hgfhfg");
        cafe3.tipoDeCafe();
        System.out.println("--------------------");

    }
}
