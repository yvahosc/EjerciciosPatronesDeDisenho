package co.com.MAKAIA.Ejercicio3;

public class Calculadora {
    private static Calculadora calculadora;

    private Calculadora(){}

    public static Calculadora getInstancia(){
        if(calculadora == null){
            calculadora = new Calculadora();
        }
        return calculadora;
    }

    public void sumar(int numero1, int numero2){
        System.out.println("El resultado de la suma (" + numero1 + ") + ("
                + numero2 + ") es: " + (numero1 + numero2) + ".");
    }

    public void restar(int minuendo, int sustraendo){
        System.out.println("El resultado de la resta (" + minuendo + ") - ("
                + sustraendo + ") es: " + (minuendo - sustraendo) + ".");
    }

    public void multiplicar(int numero1, int numero2){
        System.out.println("El resultado de la multiplicación (" + numero1 +
                ") * (" + numero2 + ") es: " + (numero1 * numero2) + ".");
    }

    public void dividir(int dividendo, int divisor){
        if(divisor == 0){
            System.out.println("Error. La división entre cero no está " +
                    "definida.");
        }else{
            System.out.println("El resultado de la división (" + dividendo +
                    ") / (" + divisor + ") es: " + (dividendo / divisor) + ".");
        }
    }

    public void sacarRaizCuadrada(int numero){
        if(numero < 0){
            System.out.println("Error. La raíz cuadrada de un número negativo" +
                    " no está definida.");
        }else{
            System.out.println("El resultado de la raíz cuadrada de (" + numero +
                    ") es: " + Math.sqrt(numero) + ".");
        }
    }

    public void elevarAlCuadrado(int numero){
        System.out.println("El resultado de (" + numero + ") elevado al " +
                "cuadrado es: " + Math.pow(numero, 2) + ".");
    }
}
