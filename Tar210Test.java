//@author Luis Mario Celaya Melgarejo.
package tar210;

public class Tar210Test {
    
    public static void main(String[] args) {
    
        Tar210 elevador = new Tar210();
        elevador.abrePuerta();
        elevador.cierraPuerta();
        elevador.sube();
        elevador.baja();
        elevador.pisoDeseado(5);
        elevador.baja();
        elevador.estadoPuertas();
        /*
        elevador.estadoPuertas();*/

    }
    
}
