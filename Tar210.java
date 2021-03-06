//@author Luis Mario Celaya Melgarejo.
package tar210;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Tar210 {

    boolean puerta;
    int pisoActual;
    final int pisoMax = 5;
    final int pisoMin = 1;
    final int pesoMax=1000;

public void abrePuerta(){
    puerta = true;
    System.out.println("Puertas abiertas.");
}
    
public void cierraPuerta(){
    int menor=50;
    int mayor=1500;
    int peso=0;
    while(peso<pesoMax){
    ThreadLocalRandom tlr = ThreadLocalRandom.current();
        peso = tlr.nextInt(menor, mayor + 1);
        System.out.println("Peso total del personal: "+peso+" kg.");
        if (peso>pesoMax){ 
            System.out.println("Cupo excedido.");
            peso = 0;
        } else { break;}
    }
        puerta=false;
        System.out.println("Puertas cerradas.");
}

public void sube(){
    if (puerta==true){
        System.out.println("Antes de subir o bajar, debe cerrar las puertas.");
        return;}
    else if (pisoActual==pisoMax){
        System.out.println("Es el piso máximo. No se puede subir más.");
        return;}
    else { pisoActual = pisoActual+1;}
    }

public void baja(){
    if (puerta==true){
        System.out.println("Antes de subir o bajar, debe cerrar las puertas.");
        return;}
    else if (pisoActual==pisoMin){
        System.out.println("Es el piso mínimo. No se puede bajar más.");
        return;}
    else { pisoActual = pisoActual-1;}
    }

    public void pisoDeseado(int pisoObjetivo){
        Scanner sc = new Scanner (System.in);
        // Moviendo lógica de entrada a test
        // int pisoDeseado = sc.nextInt();

        // Validando el piso objetivo
        if (pisoObjetivo<pisoMin || pisoObjetivo>pisoMax){
            System.out.println("El piso deseado no es válido.");
            return;} 


        while (pisoObjetivo!=pisoActual){
            if (pisoObjetivo > pisoActual) sube();
            else baja();
        }

        // esto debería ir en el método pisoActual
        System.out.println("Llegando al piso: " + pisoActual);

    }

    // Ejemplo 
    public void estadoPuertas(){
        
        String estado = "cerradas";
        if (puerta) estado = "abiertas";
        
        System.out.println("Las puertas están " + estado + " en el piso " + pisoActual);
    }
        
}