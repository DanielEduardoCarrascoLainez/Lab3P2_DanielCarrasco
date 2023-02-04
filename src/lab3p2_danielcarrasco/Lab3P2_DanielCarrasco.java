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
        try{
        boolean banderita= true;
        ArrayList <Concesionaria> concesionarias= new ArrayList();
        ArrayList <Clientes> clientecitos= new ArrayList();
        //Clientes cliente= new Clientes();
        
        
        while(banderita == true){
        
        System.out.println("Bienvenidx al programa");
        System.out.println("------------------------------");
        System.out.println("-------------Menu-------------");
        System.out.println("1-. CRUD Concesionaria");
        System.out.println("2-. CRUD Clientes");
        System.out.println("3-. CRUD Vehiculos");
        System.out.println("4-. Compra y venta");
        System.out.println("5-. Salir");
        int opUss= ninetales.nextInt();
        
        switch (opUss){
            //Inicio CRUD CONCESIONARIA
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
                        Scanner consS = new Scanner(System.in);
                        System.out.println("Bienvenido a crear concesionaria-----");
                        System.out.println("Ingrese el nombre de la concesionaria");
                        String nombreC= consS.nextLine();
                        System.out.println("Ingrese la direccion de la concesionaria");
                        String direccionC= consS.nextLine();
                        System.out.println("Ingrese el saldo de la concesionaria");
                        double saldoC= consS.nextInt();
                        
                        int iDE=0;                
                        for (int i = 0; i < concesionarias.size(); i++) {
                            iDE= iDE+1;
                        }
                        
                        Concesionaria concesionaria= new Concesionaria(nombreC,iDE,direccionC,saldoC);
                        concesionarias.add(concesionaria);
                        System.out.println("Concesionaria creada con exito");
                        break;
                    case 2:
                        Scanner consCa= new Scanner(System.in);
                        for (int i = 0; i < concesionarias.size(); i++) {
                            System.out.println(i+"-. ["+concesionarias.get(i)+"]");
                        }
                        System.out.println("------------------------------");
                        System.out.println("Ingrese el numero de concesionaria que desea cambiar");
                        int posCambiar=consCa.nextInt();
                        
                        if(posCambiar<=concesionarias.size()-1){
                            Scanner seTrabo= new Scanner(System.in);
                            System.out.println("Ingrese la nueva direccion");
                            String direccionN= seTrabo.nextLine();
                            concesionarias.get(posCambiar).setDireccionE(direccionN);
                            System.out.println("Se ha cambiado la direccion correctamente");
                        }else{
                            System.out.println("No puedes cambiar cosas que no existen");
                        }
                        break;
                    case 3:
                        Scanner consEli= new Scanner(System.in);
                        for (int i = 0; i < concesionarias.size(); i++) {
                            System.out.println(i+"-. ["+concesionarias.get(i)+"]");
                        }
                        System.out.println("------------------------------");
                        System.out.println("Ingrese el numero de concesionaria que desea cambiar");
                        int posEliminar=consEli.nextInt();
                        
                        if(posEliminar<=concesionarias.size()-1){
                            concesionarias.remove(posEliminar);
                            System.out.println("Concesionaria eliminada");
                        }else{
                            System.out.println("Lo lamento, no puedes eliminar cosas que no existen");
                        }
                        break;
                    default:
                        System.out.println("Saliendo...");
                        break;
                }
                
                break;
                //Fin CRUD CONCESIONARIA
                //Inicio CRUD Clientes
            case 2:
                Scanner tales = new Scanner(System.in);
                System.out.println("------------------------------");
                System.out.println("------CRUD Concesionaria------");
                System.out.println("1-. Crear Cliente");
                System.out.println("2-. Eliminar Cliente");
                System.out.println("3-. Salir");
                int opCliente= tales.nextInt();
                
                switch(opCliente){
                    case 1:
                        Scanner clientesC = new Scanner(System.in);
                        System.out.println("Bienvenido a crear Cliente-----");
                        System.out.println("Ingrese su Nombre");
                        String nombreC= clientesC.nextLine();
                        System.out.println("Ingrese su saldo");
                        double saldoC= clientesC.nextDouble();
                        
                        int iDEC=0;                
                        for (int i = 0; i < clientecitos.size(); i++) {
                            iDEC= iDEC+1;
                        }
                        Clientes cliente= new Clientes(iDEC,nombreC,saldoC);
                        clientecitos.add(cliente);
                        System.out.println("Cliente creado con exito");
                        
                        break;
                    case 2:
                        Scanner clientesEli= new Scanner(System.in);
                        for (int i = 0; i < clientecitos.size(); i++) {
                            System.out.println(i+"-. ["+clientecitos.get(i)+"]");
                        }
                        System.out.println("------------------------------");
                        System.out.println("Ingrese el numero del cliente que desea cambiar");
                        int posEliminarC=clientesEli.nextInt();
                        
                        if(posEliminarC<=clientecitos.size()-1){
                            clientecitos.remove(posEliminarC);
                            System.out.println("Cliente eliminadx");
                        }else{
                            System.out.println("Lo lamento, no puedes eliminar clientes que no existen");
                        }
                        break;
                    default:
                        System.out.println("Saliendo...");
                        break;
                }
                //Fin CRUD Clientes
            case 3:
                
                break;
            case 4:
                
                break;
            default:
                System.out.println("Gracias vuelva pronto");
                banderita=false;
                break;
        }
        
        
        }
        //Aqui, no toques danieeeeel
        } catch (Exception e){
            
        }
    }
    
}
