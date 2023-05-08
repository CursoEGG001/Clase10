/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
import java.util.HashMap;
import java.util.Scanner;

public class Tienda {

    private HashMap<String, Double> inventario;
    private Scanner scanner;

    public Tienda() {
        inventario = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        if (inventario.containsKey(nombre)) {
            System.out.println("El producto ya existe en el inventario.");
            return;
        }

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner

        inventario.put(nombre, precio);
        System.out.println("El producto ha sido agregado al inventario.");
    }

    public void modificarPrecio() {
        System.out.print("Ingrese el nombre del producto que desea modificar: ");
        String nombre = scanner.nextLine();

        if (!inventario.containsKey(nombre)) {
            System.out.println("El producto no existe en el inventario.");
            return;
        }

        System.out.print("Ingrese el nuevo precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner

        inventario.put(nombre, precio);
        System.out.println("El precio del producto ha sido modificado.");
    }

    public void eliminarProducto() {
        System.out.print("Ingrese el nombre del producto que desea eliminar: ");
        String nombre = scanner.nextLine();

        if (!inventario.containsKey(nombre)) {
            System.out.println("El producto no existe en el inventario.");
            return;
        }

        inventario.remove(nombre);
        System.out.println("El producto ha sido eliminado del inventario.");
    }

    public void mostrarInventario() {
        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
            return;
        }

        System.out.println("Productos en el inventario:");
        for (String nombre : inventario.keySet()) {
            double precio = inventario.get(nombre);
            System.out.printf("- %s: %.2f\n", nombre, precio);
        }
    }

    public void ejecutar() {
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
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarInventario();
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
