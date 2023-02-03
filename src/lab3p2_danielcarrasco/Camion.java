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

    public Camion(int volumenMax, int altura, boolean retro, String color, String marca, String modelo, String fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
        this.volumenMax = volumenMax;
        this.altura = altura;
        this.retro = retro;
    }

    public int getVolumenMax() {
        return volumenMax;
    }

    public void setVolumenMax(int volumenMax) {
        this.volumenMax = volumenMax;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetro() {
        return retro;
    }

    public void setRetro(boolean retro) {
        this.retro = retro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(String fechaFab) {
        this.fechaFab = fechaFab;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString()+ "Camion{" + "volumenMax=" + volumenMax + ", altura=" + altura + ", retro=" + retro + '}';
    }
    
    
    
}
