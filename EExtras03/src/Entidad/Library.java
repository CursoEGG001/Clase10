/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.HashSet;
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


public class Library {

    private HashSet<Book> books;

    public Library() {
        books = new HashSet<>();
    }

    public void addBook(String title, String author, int numCopies) {
        books.add(new Book(title, author, numCopies));
    }

    public boolean loanBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.getNumCopies() > 0) {
                    book.setNumCopies(book.getNumCopies() - 1);
                    return true;
                } else {
                    System.out.println("No copies of that book are available.");
                    return false;
                }
            }
        }
        System.out.println("That book is not in the library.");
        return false;
    }

    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.setNumCopies(book.getNumCopies() + 1);
                return true;
            }
        }
        System.out.println("That book is not in the library.");
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book).append("\n");
        }
        return sb.toString();
    }
}
