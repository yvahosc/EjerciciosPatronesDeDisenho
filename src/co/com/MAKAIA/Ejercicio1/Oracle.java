package co.com.MAKAIA.Ejercicio1;

public class Oracle implements ConexionABBDD{

    private static Oracle instanciaOracle;
    private String nombre;
    private int numeroConexiones = 0;

    private Oracle(String nombre) {
        this.nombre = nombre;
    }

    public static Oracle getInstancia(String nombre){
        if(instanciaOracle == null){
            instanciaOracle = new Oracle(nombre);
        }
        return instanciaOracle;
    }

    public int getNumeroConexiones() {
        return numeroConexiones;
    }

    @Override
    public void conectarABBDD(){
        numeroConexiones++;
        System.out.println("Conectándose a BD " + nombre);
        System.out.println(instanciaOracle);
    }
}
