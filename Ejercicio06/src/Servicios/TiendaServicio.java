/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Tienda;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TiendaServicio {

    public static void TiendaServicio() {

        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        boolean salir = false;

        while (!salir) {
            System.out.println("\n-- Menú de opciones --");
            System.out.println("1. Agregar producto");
            System.out.println("2. Modificar precio de un producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar inventario");
            System.out.println("5. Salir");

            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tienda.agregarProducto();
                    break;
                case 2:
                    tienda.modificarPrecio();
                    break;
                case 3:
                    tienda.eliminarProducto();
                    break;
                case 4:
                    tienda.mostrarInventario();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

}
