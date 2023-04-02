/*
Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.
*/
package guia5;
import java.util.Scanner;

public class Ej5extra {
    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        int f,c,suma=0;
        
        System.out.println("Ingrese la cantidad de filas");
        f = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
        c = leer.nextInt();
        
        int vec[][]=new int[f][c];
        
        for (int i = 0; i < f; i++) {
            
            for (int j = 0; j < c; j++) {
                
                vec[i][j]=(int)(Math.random()*10);
                System.out.print(vec[i][j]+" ");
                suma=vec[i][j]+suma;
            }
            System.out.println("");
        }
        System.out.println("La suma de los elementos de la matriz es: "+suma);
    }
}
