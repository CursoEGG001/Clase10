/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Discografica;

/**
 *
 * @author pc
 */
public class CantanteFamoso {


    private String name;
    private String discConMasVentas;

    public CantanteFamoso(String name, String discConMasVentas) {
        this.name = name;
        this.discConMasVentas = discConMasVentas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscConMasVentas() {
        return discConMasVentas;
    }

    public void setDiscConMasVentas(String discConMasVentas) {
        this.discConMasVentas = discConMasVentas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" +
                "name='" + name + '\'' +
                ", discConMasVentas='" + discConMasVentas + '\'' +
                '}';
    }
}
