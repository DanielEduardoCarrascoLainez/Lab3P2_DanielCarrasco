/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

import java.util.Date;


public class Carro extends Vehiculos {
    private int cantidadPuertas;
    private String descMMotor;
    private int velMax;

    public Carro(int cantidadPuertas, String descMMotor, int velMax, String color, String marca, String modelo, Date fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.descMMotor = descMMotor;
        this.velMax = velMax;
    }

    public Carro(String color, String marca, String modelo, Date fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getDescMMotor() {
        return descMMotor;
    }

    public void setDescMMotor(String descMMotor) {
        this.descMMotor = descMMotor;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
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
    
    
}
