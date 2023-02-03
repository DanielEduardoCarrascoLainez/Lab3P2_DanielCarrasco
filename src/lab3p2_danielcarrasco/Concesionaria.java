/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielcarrasco;

import java.util.ArrayList;

public class Concesionaria {
    private String nombreE;
    private int IDE;
    private String direccionE;
    private ArrayList <Vehiculos> vehiculos= new ArrayList();
    private ArrayList <Clientes> clientes = new ArrayList();
    private double saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombreE, int IDE, String direccionE, double saldo) {
        this.nombreE = nombreE;
        this.IDE = IDE;
        this.direccionE = direccionE;
        this.saldo = saldo;
    }

    

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getIDE() {
        return IDE;
    }

    public void setIDE(int IDE) {
        this.IDE = IDE;
    }

    public String getDireccionE() {
        return direccionE;
    }

    public void setDireccionE(String direccionE) {
        this.direccionE = direccionE;
    }

    public ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculos> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Clientes> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Clientes> clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombreE=" + nombreE + ", IDE=" + IDE + ", direccionE=" + direccionE + ", vehiculos=" + vehiculos + ", clientes=" + clientes + ", saldo=" + saldo + '}';
    }
    
    
    
}
