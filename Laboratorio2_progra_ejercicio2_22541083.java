/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio2_progra_ejercicio2_22541083;
import java.util.Scanner;

public class Laboratorio2_progra_ejercicio2_22541083 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n= new Scanner(System.in);
        int numero, suma, igualdad;
        igualdad=0;
        suma=1;
        System.out.println (" Ingrese 1. si desea todos los tickets, 2. si desea pares, 3. si desea impares ");
        numero= n.nextInt();
        switch (numero){
            case (1): 
                break;
            case (2): 
                suma=2;
                break;
            case (3):
                suma=2;
                igualdad=1;
                
            
                
                
            
        }
        for (int i=igualdad; i<10; i+=suma){
            
           System.out.println ("Turno "+ (i+1) + ": Bienvenido Clinica ABC");
<<<<<<< HEAD
           System.out.println("commit");
           
           
           
           System.out.println("hola mundo");
=======
           System.out.println("commit 33 dos en main");
>>>>>>> e01f1ca74d3cadfb20686fa56fe6256dfe4b7316
        }
    }
    
}
