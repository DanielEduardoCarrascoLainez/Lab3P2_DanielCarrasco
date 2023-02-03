/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_danielcarrasco;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DanielCarrasco {
    
    static Scanner ninetales = new Scanner(System.in);

    public static void main(String[] args) {
        boolean banderita= true;
        Clientes cliente= new Clientes();
        
        try{
        while(banderita == true){
        
        System.out.println("Bienvenidx al programa");
        System.out.println("------------------------------");
        System.out.println("-------------Menu-------------");
        System.out.println("1-. CRUD Concesionaria");
        System.out.println("2-. CRUD Clientes");
        System.out.println("3-. CRUD Vehiculos");
        System.out.println("4-.Compra y venta");
        System.out.println("Salir");
        int opUss= ninetales.nextInt();
        
        switch (opUss){
            case 1:
                Scanner nine = new Scanner(System.in);
                System.out.println("------------------------------");
                System.out.println("------CRUD Concesionaria------");
                System.out.println("1-. Crear Concesionaria");
                System.out.println("2-. Actualizar Concesionaria");
                System.out.println("3-. Eliminar Concesionaria");
                System.out.println("4-. Salir");
                int opCons= nine.nextInt();
                
                switch(opCons){
                    case 1:
                        System.out.println("Bienvenido a crear concesionaria-----");
                        System.out.println("Ingrese el nombre de la concesionaria");
                        System.out.println("Ingrese");
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                    default:
                        System.out.println("Saliendo...");
                }
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                System.out.println("Gracias vuelva pronto");
                break;
        }
        
        
        }
        //Aqui
        } catch (Exception e){
            
        }
    }
    
}
