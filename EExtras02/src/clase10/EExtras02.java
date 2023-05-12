/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase10;

import Discografica.CantanteFamoso;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class EExtras02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea una lista de objetos CantanteFamoso
        ArrayList<CantanteFamoso> cantanteFamoso = new ArrayList<>();

        // Le manda 5 famosos
        cantanteFamoso.add(new CantanteFamoso("Luis Miguel", "El Concierto"));
        cantanteFamoso.add(new CantanteFamoso("Juan Gabriel", "Querido México"));
        cantanteFamoso.add(new CantanteFamoso("Selena Quintanilla", "Amor Prohibido"));
        cantanteFamoso.add(new CantanteFamoso("Ricky Martin", "Vuelve"));
        cantanteFamoso.add(new CantanteFamoso("Shakira", "Loba"));

        // Muestra el nombre de los cantantes y su disco con mas ventas
        for (CantanteFamoso aux : cantanteFamoso) {
            System.out.println("Nombre del cantante: " + aux.getName() + ", Álbum con más ventas: " + aux.getDiscConMasVentas());
        }

        // Para leer la entrada
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        // Mientras no elija salir...
        while (true) {
            // HAce el Menu
            System.out.println("1. Agregar cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");

            // Leer opcion
            int opcion = scanner.nextInt();

            // Switch de opcion
            switch (opcion) {
                case 1:
                    // Solicita el nombre del cantante nuevo
                    System.out.println("Ingrese el nombre del nuevo cantante: ");
                    String elNuevo = scanner.next();

                    // Solicita al usuario el disco con más ventas
                    System.out.println("Ingrese el nombre del álbum con más ventas del nuevo cantante: ");
                    String elNuevoMV = scanner.next();

                    // Crea el nuevo objeto CantanteFamoso y lo agrega a la lista
                    cantanteFamoso.add(new CantanteFamoso(elNuevo, elNuevoMV));
                    break;
                case 2:
                    // Muestra los nombres de la lista
                    for (CantanteFamoso aux : cantanteFamoso) {
                        System.out.println("Nombre del cantante: " + aux.getName() + ", Álbum con más ventas: " + aux.getDiscConMasVentas());
                    }
                    break;
                case 3:
                    // Solicita el nombre a eliminar
                    System.out.println("Ingrese el nombre del cantante que desea eliminar: ");
                    String borraNombre = scanner.next();

                    // Busca y borra el cantante
                    int borraFamoso = -1;
                    for (int i = 0; i < cantanteFamoso.size(); i++) {
                        if (cantanteFamoso.get(i).getName().equals(borraNombre)) {
                            borraFamoso = i;
                            break;
                        }
                    }

                    // Si encuentra el famoso lo saca de la lista
                    if (borraFamoso != -1) {
                        cantanteFamoso.remove(borraFamoso);
                    } else {
                        System.out.println("El cantante no existe.");
                    }
                    break;
                case 4:
                    // Termina el programita
                    System.exit(0);
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
