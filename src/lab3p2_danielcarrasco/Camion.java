/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

import java.util.Date;

public class Camion extends Vehiculos {
    private int volumenMax;
    private int altura;
    private boolean retro;

    public Camion(int volumenMax, int altura, boolean retro, String color, String marca, String modelo, Date fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
        this.volumenMax = volumenMax;
        this.altura = altura;
        this.retro = retro;
    }
    
    
}
