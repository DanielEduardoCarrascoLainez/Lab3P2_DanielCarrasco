/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

public class Bici extends Vehiculos {
    private String descB;
    private int radio;
    private boolean calle;

    public Bici(String color, String marca, String modelo, String fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
    }

    public Bici(String descB, int radio, boolean calle, String color, String marca, String modelo, String fechaFab, double precio) {
        super(color, marca, modelo, fechaFab, precio);
        this.descB = descB;
        this.radio = radio;
        this.calle = calle;
    }

    public String getDescB() {
        return descB;
    }

    public void setDescB(String descB) {
        this.descB = descB;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isCalle() {
        return calle;
    }

    public void setCalle(boolean calle) {
        this.calle = calle;
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
        return super.toString()+"Bici{" + "descB=" + descB + ", radio=" + radio + ", calle=" + calle + '}';
    }
    
    
}
