/*
Los profesores del curso de programación de Egg necesitan llevar un
registro de las notas adquiridas por sus 10 alumnos para luego obtener
una cantidad de aprobados y desaprobados. Durante el período de
cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
evaluativos y 2 por parciales. Las ponderaciones de cada nota son:

Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%

Una vez cargadas las notas, se calcula el promedio y se guarda en el
arreglo. Al final del programa los profesores necesitan obtener por
pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
notas del curso.
 */
package guia5;

import java.util.Scanner;

public class Ej4extra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        double n1, n2, n3, n4;
        int n = 10, contA = 0, contB = 0;
        double vec[] = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la nota 1 (10%)");
            n1 = leer.nextInt();
            System.out.println("Ingrese la nota 2 (15%)");
            n2 = leer.nextInt();
            System.out.println("Ingrese la nota 3 (25%)");
            n3 = leer.nextInt();
            System.out.println("Ingrese la nota 4 (50%)");
            n4 = leer.nextInt();
            vec[i] = (n1 * 0.1 + n2 * 0.15 + n3 * 0.25 + n4 * 0.5);
            System.out.print("Nota:" + vec[i]);
            System.out.println("");
            if (vec[i] >= 7) {
                contA++;
            } else {
                contB++;
            }

        }
        System.out.println("");
        System.out.println("Alumnos aprobados=" + contA + "   Alumnos desaprobados=" + contB);

    }
}
