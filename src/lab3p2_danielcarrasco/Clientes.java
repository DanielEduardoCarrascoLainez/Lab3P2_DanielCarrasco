/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

import java.util.ArrayList;

public class Clientes {
    private int ID;
    private String nombre;
    private ArrayList <Vehiculos> vehiculosCliente = new ArrayList();
    private double saldo;

    public Clientes(int ID, String nombre, double saldo) {
        this.ID = ID;
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public Clientes() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vehiculos> getVehiculosCliente() {
        return vehiculosCliente;
    }

    public void setVehiculosCliente(ArrayList<Vehiculos> vehiculosCliente) {
        this.vehiculosCliente = vehiculosCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Clientes{" + "ID=" + ID + ", nombre=" + nombre + ", vehiculosCliente=" + vehiculosCliente + ", saldo=" + saldo + '}';
    }
    
    
}
