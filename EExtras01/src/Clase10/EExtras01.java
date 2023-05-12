/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y los guarde en un ArrayList de tipo
 * Integer. La lectura de números termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList. A
 * continuación, el programa mostrará por pantalla el número de valores que se han leído, su suma y su media (promedio).
 *
 * @author pc
 */
public class EExtras01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cree un objeto Scanner para leer la entrada desde el teclado
        Scanner leer = new Scanner(System.in);

        // Cree una ArrayList para almacenar los valores enteros
        ArrayList<Integer> numeros = new ArrayList<>();

        // Solicitar al usuario que ingrese una serie de valores enteros
        System.out.println("Introduzca una serie de valores enteros. Introduzca -99 para detener.");

        // Leer los valores enteros del teclado
        int numero;
        while ((numero = leer.nextInt()) != -99) {
            numeros.add(numero);
        }

        // Calcular el número de valores que se han leído
        int cntVal = numeros.size();

        // Calcular la suma de los valores
        int sum = 0;
        for (int i = 0; i < cntVal; i++) {
            sum += numeros.get(i);
        }

        // Calcular el promedio de los valores.
        double prom = (double) sum / cntVal;

        // Mostrar el número de valores, su suma y su promedio
        System.out.println("El número de valores leídos es: " + cntVal);
        System.out.println("La suma de los valores es: " + sum);
        System.out.println("El promedio de los valores es: " + prom);
    }
}
