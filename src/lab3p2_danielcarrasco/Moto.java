/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

import java.util.Date;

public class Moto extends Vehiculos {
    private int desplMotor;
    private boolean electrica;

    public Moto(int desplMotor, boolean electrica, String color, String marca, String modelo, Date fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
        this.desplMotor = desplMotor;
        this.electrica = electrica;
    }

    public Moto(String color, String marca, String modelo, Date fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
    }

    public int getDesplMotor() {
        return desplMotor;
    }

    public void setDesplMotor(int desplMotor) {
        this.desplMotor = desplMotor;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
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
