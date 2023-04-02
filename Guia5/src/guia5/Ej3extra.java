/*
Crear una función rellene un vector con números aleatorios, pasándole
un arreglo por parámetro. Después haremos otra función o
procedimiento que imprima el vector.
 */
package guia5;

public class Ej3extra {

    public static void main(String[] args) {
       
        int n = 8;
        int vec[] = new int[n];
        
        rellenar(vec);
        imprimir(vec);
    }

    public static void rellenar(int vec[]) {
        for (int i = 0; i < vec.length; i++) {
            vec[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void imprimir(int vec[]) {
        for (int var : vec) {
            System.out.print(var + " ");
        }
        System.out.println("");
    }
}
