package co.com.MAKAIA.Ejercicio1;

public class MySQL implements ConexionABBDD{
    private static MySQL instanciaMySQL;
    private String nombre;
    private int numeroConexiones = 0;

    private MySQL(String nombre) {
        this.nombre = nombre;
    }

    public static  MySQL getInstancia(String nombre){
        if(instanciaMySQL == null){
            instanciaMySQL = new MySQL(nombre);
        }
        return instanciaMySQL;
    }

    public int getNumeroConexiones() {
        return numeroConexiones;
    }

    @Override
    public void conectarABBDD(){
        numeroConexiones++;
        System.out.println("Conectándose a BD " + nombre);
        System.out.println(instanciaMySQL);
    }
}
