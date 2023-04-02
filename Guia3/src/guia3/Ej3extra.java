/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. 
Nota: investigar la función equals() de la clase String.
*/
package guia3;
import java.util.Scanner;

public class Ej3extra {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar una letra: ");
        char primerLetra = leer.nextLine().charAt(0);   //leemos la cadena y tomamos la primer letra (posición 0)
        String letra = String.valueOf(primerLetra);     //la letra la pasamos a tipo String para acceder a sus métodos
        
        boolean vocal = letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u");
        
        if(vocal){
            System.out.println("La letra es una vocal");
        }else{
            System.out.println("La letra no es una vocal");
        }
        
        
    }
}
