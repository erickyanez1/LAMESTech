/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

import java.util.Scanner;

/**
 *
 * @author LAMESTech ESPE-DCC0
 */
public class SystemDisplayLAMES {
    public static void main(String[] args) {
        System.out.println("LAMESTech");
        
    boolean salir = false; 
    int option;
        
        
    while (!salir) {
     Scanner sn = new Scanner(System.in);
     System.out.println("Choose the material you want to search \n ");
     System.out.println("1. 9V battery ");
     System.out.println("2. Led Diodes ");
     System.out.println("3. Resistors ");
     System.out.println("4. Integrate circuits ");
     System.out.println("5. Dipswitch ");
     System.out.println("6. Capacitors ");
     System.out.println("7. Potentiometer ");
     System.out.println("8. Transistor ");
     System.out.println("9. Protoboard ");
     System.out.println("10. Multimeter ");
     System.out.println("11. Salir");

     System.out.println("Enter a number ");
     option = sn.nextInt();   
     switch (option) {
         case 1:
            
         break;
             
         case 2:
            
         break;
         
         case 3:
            
         break;
             
         case 4:
            
         break;
             
         case 5:
            
         break;
             
         case 6:
            
         break;
             
         case 7:
            
         break;
         
         case 8:
            
         break;
         
         case 9:
            
         break;
             
         case 10:
            
         break;
         
         case 11:
            salir = true;
            break;
         default:
            System.out.println("Invalid option, enter again.");
             
     }   
    }   
     
    }
}
