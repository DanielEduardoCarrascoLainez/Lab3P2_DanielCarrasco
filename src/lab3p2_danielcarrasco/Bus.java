/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

import java.util.Date;

public class Bus extends Vehiculos {
    private int cantPasageros;
    private String tipo;

    public Bus(int cantPasageros, String tipo, String color, String marca, String modelo, Date fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
        this.cantPasageros = cantPasageros;
        this.tipo = tipo;
    }

    public Bus(String color, String marca, String modelo, Date fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
    }

    

    public int getCantPasageros() {
        return cantPasageros;
    }

    public void setCantPasageros(int cantPasageros) {
        this.cantPasageros = cantPasageros;
        
        if(cantPasageros>0){
          if(cantPasageros<=50){
            tipo="Rapidito";
        }else{
            tipo="De Ruta";
        }  
        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        
        
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
