/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.util.Objects;
import java.util.Scanner;

/**
 * Crear una clase llamada "AgendaTelefónica" que permita almacenar contactos con su nombre y número de teléfono. La clase
 * debe tener métodos para agregar un contacto nuevo, buscar un contacto por nombre, mostrar todos los contactos y mostrar
 * los contactos ordenados alfabéticamente por nombre. En el programa principal, crear un mapa (HashMap) de tipo "String"
 * (nombre del contacto) y "Integer" (número de teléfono). Luego, mostrar un menú que le dé al usuario la opción de agregar
 * un contacto, buscar un contacto por nombre, mostrar todos los contactos o mostrar los contactos ordenados alfabéticamente.
 *
 * @author pc
 */
public class AgendaTelefonica {
    private String nomContacto;
    private int numContacto;
    
    Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    
    public AgendaTelefonica() {
    }

    public AgendaTelefonica(String nomContacto, int numContacto) {
        this.nomContacto = nomContacto;
        this.numContacto = numContacto;
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public int getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }
    
    public AgendaTelefonica creaAgTel(){
        String nom1;
        int num1;
        System.out.print("Ingrese el nombre a agendar:");
        nom1= leer.next();
        System.out.print("Ingrese el numero a guardar:");
        num1=leer.nextInt();
        return new AgendaTelefonica(nom1,num1);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nomContacto);
        hash = 83 * hash + this.numContacto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AgendaTelefonica other = (AgendaTelefonica) obj;
        if (this.numContacto != other.numContacto) {
            return false;
        }
        return Objects.equals(this.nomContacto, other.nomContacto);
    }
    
}
