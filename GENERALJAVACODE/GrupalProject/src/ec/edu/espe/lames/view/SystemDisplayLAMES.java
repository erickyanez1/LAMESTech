/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

import java.util.Scanner;
import ec.edu.espe.lames.model.ElectronicMaterial;

/**
 *
 * @author LAMESTech ESPE-DCC0
 */
public class SystemDisplayLAMES {
    public static void main(String[] args) {
        System.out.println("☻ Welcome to LAMESTech ☻");
        
        String name;
        String fabricator;
        float cost;
        
        int option = 0;
        Scanner sn = new Scanner(System.in);
        
        ElectronicMaterial em [] = new ElectronicMaterial[10];
        
        System.out.println("9VBattery\tLEDDiodes\tResistor\tIntegratedCircuit");
        System.out.println("$3.00 - $2\t$0.25 - $0.50\t$0.20 - $0.30\t$0.80 - $1.50");
        System.out.println("A  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B\t");
        System.out.println("\nDipswitch\tCapacitor\tPotentiometer\tTransistor\tProtoboard");
        System.out.println("$0.70 - $1.20\t$0.60 - $1.00\t$0.80 - $1.25\t$0.70 - $1.00\t$18.00 - $5.00");
        System.out.println("A  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B");
        
        for(int i = 0; i < option; i++){
            System.out.println("Enter the name of the Product");
            name = sn.next();
            System.out.println("Select the cost");
            cost = sn.nextFloat();
            System.out.println("Select the Fabricator");
            fabricator = sn.next();
            em[i] = new ElectronicMaterial(name, fabricator, cost);
 
        }  
        
       for(int i = 0; i<option; i++){
           System.out.println(em[i]);
       }
              
    }
}
