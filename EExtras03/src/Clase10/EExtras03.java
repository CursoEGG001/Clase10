/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clase10;

import Entidad.Library;
import java.util.Scanner;

/**
 * Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos repetidos. Para ello, se debe crear
 * una clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca. La clase Libro debe guardar
 * el título del libro, autor, número de ejemplares y número de ejemplares prestados. También se creará en el main un HashSet
 * de tipo Libro que guardará todos los libros creados. En el main tendremos un bucle que crea un objeto Libro pidiéndole al
 * usuario todos sus datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le pregunta al
 * usuario si quiere crear otro Libro o no. La clase Librería contendrá además los siguientes métodos: • Constructor por
 * defecto. • Constructor con parámetros. • Métodos Setters/getters • Método prestamo(): El usuario ingresa el titulo del
 * libro que quiere prestar y se lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto Libro al método. El
 * método se incrementa de a uno, como un carrito de compras, el atributo ejemplares prestados, del libro que ingresó el
 * usuario. Esto sucederá cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden
 * ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario. •
 * Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo busca en el conjunto. Si está en
 * el conjunto, se llama con ese objeto al método. El método decrementa de a uno, como un carrito de compras, el atributo
 * ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se produzca la devolución de un
 * libro. No se podrán devolver libros donde que no tengan ejemplares prestados. Devuelve true si se ha podido realizar la
 * operación y false en caso contrario. • Método toString para mostrar los datos de los libros.
 *
 * @author pc
 */
public class EExtras03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        Library library = new Library();

        int choice;

        System.out.println("Welcome to the library! What would you like to do?");
        System.out.println("1. Add a book");
        System.out.println("2. Loan a book");
        System.out.println("3. Return a book");
        System.out.println("4. List all books");
        System.out.println("5. Exit");

        while ((choice = scanner.nextInt()) != 5) {
            switch (choice) {
                case 1:
                    System.out.println("Enter the title of the book: ");
                    String title = scanner.next();
                    System.out.println("Enter the author of the book: ");
                    String author = scanner.next();
                    System.out.println("Enter the number of copies of the book: ");
                    int numCopies = scanner.nextInt();
                    library.addBook(title, author, numCopies);

                    break;
                case 2:
                    System.out.println("Enter the title of the book you want to loan: ");
                    String loanTitle = scanner.nextLine();
                    if (library.loanBook(loanTitle)) {
                        System.out.println("The book has been loaned.");
                    } else {
                        System.out.println("The book could not be loaned.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the title of the book you want to return: ");
                    String returnTitle = scanner.next();
                    if (library.returnBook(returnTitle)) {
                        System.out.println("The book has been returned.");
                    } else {
                        System.out.println("The book could not be returned.");
                    }
                    break;
                case 4:
                    System.out.println(library);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            System.out.println("Welcome to the library! What would you like to do?");
            System.out.println("1. Add a book");
            System.out.println("2. Loan a book");
            System.out.println("3. Return a book");
            System.out.println("4. List all books");
            System.out.println("5. Exit");
        }

        System.out.println("Goodbye!");
    }
}
