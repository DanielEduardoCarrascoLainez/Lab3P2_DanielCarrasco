/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

//import java.awt.Color;
import java.util.Date;

public class Vehiculos {
    protected String color;
    protected String marca;
    protected String modelo;
    protected Date fechaFab;
    protected double precio;

    public Vehiculos(String color, String marca, String modelo, Date fechaFab, double precio) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFab = fechaFab;
        this.precio = precio;
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

    public Date getFechaFab() {
        return fechaFab;
    }

    public void setFechaFab(Date fechaFab) {
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
        return "Vehiculos{" + "color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", fechaFab=" + fechaFab + ", precio=" + precio + '}';
    }
    
    
}
