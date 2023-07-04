package co.com.MAKAIA.Ejercicio3;

public class MainEjercicio3 {

    public static void main(String[] args) {
        Calculadora calculadora = Calculadora.getInstancia();

        calculadora.sumar(1,-9);
        calculadora.restar(-1,-2);
        calculadora.multiplicar(1,0);
        calculadora.dividir(1,0);
        calculadora.dividir(10,2);
        calculadora.sacarRaizCuadrada(9);
        calculadora.elevarAlCuadrado(10);


    }
}
