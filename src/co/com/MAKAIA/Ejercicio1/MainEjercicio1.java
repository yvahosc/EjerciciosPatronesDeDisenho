package co.com.MAKAIA.Ejercicio1;

public class MainEjercicio1 {

    public static void main(String[] args) {
	    MySQL mySQL1 = MySQL.getInstancia("MySQL-1");
        mySQL1.conectarABBDD();
        System.out.println("Número de conexiones: " + mySQL1.getNumeroConexiones());
        System.out.println("-----------------------------");

        MySQL mySQL2 = MySQL.getInstancia("MySQL-2");
        mySQL2.conectarABBDD();
        System.out.println("Número de conexiones: " + mySQL2.getNumeroConexiones());
        System.out.println("-----------------------------");

        Oracle oracle1 = Oracle.getInstancia("Oracle-1");
        oracle1.conectarABBDD();
        System.out.println("Número de conexiones: " + oracle1.getNumeroConexiones());
        System.out.println("-----------------------------");

        Oracle oracle2 = Oracle.getInstancia("Oracle-1");
        oracle1.conectarABBDD();
        System.out.println("Número de conexiones: " + oracle2.getNumeroConexiones());

    }
}
