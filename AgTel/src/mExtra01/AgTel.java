/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mExtra01;
import Agenda.AgendaTelefonica;
import java.util.Scanner;

public class AgTel {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 5) {
            System.out.println("=== Menú de la Agenda Telefónica ===");
            System.out.println("1. Agregar un contacto");
            System.out.println("2. Buscar un contacto por nombre");
            System.out.println("3. Mostrar todos los contactos");
            System.out.println("4. Mostrar los contactos ordenados alfabéticamente");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea después de leer la opción

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el número de teléfono: ");
                    int numeroTelefono = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el salto de línea después de leer el número de teléfono
                    agenda.agregarContacto(nombre, numeroTelefono);
                    System.out.println("Contacto agregado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del contacto a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    agenda.buscarContacto(nombreBuscar);
                    break;
                case 3:
                    agenda.mostrarContactos();
                    break;
                case 4:
                    agenda.mostrarContactosOrdenados();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }

            System.out.println();
        }
    }
}
