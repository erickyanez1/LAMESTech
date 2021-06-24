/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;
import ec.edu.espe.lames.model.ElectronicMaterial;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author LAMESTech ESPE-DCC0
 */
public class SystemDisplayLAMES {
    public static void main(String[] args) throws IOException {
        System.out.println("☻ Welcome to LAMESTech ☻");
        ElectronicMaterial electronicMaterial;
        String name;
        String fabricator;
        float cost;
        String jsonElectronicMaterial = "";
        FileWriter file = new FileWriter("./files/ElectronicMaterial.json");
        
        int option = 0;
        Scanner sn = new Scanner(System.in);
        
        do{
        System.out.println("9VBattery\tLEDDiodes\tResistor\tIntegratedCircuit");
        System.out.println("$3.00 - $2\t$0.25 - $0.50\t$0.20 - $0.30\t$0.80 - $1.50");
        System.out.println("A  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B\t");
        System.out.println("\nDipswitch\tCapacitor\tPotentiometer\tTransistor\tProtoboard");
        System.out.println("$0.70 - $1.20\t$0.60 - $1.00\t$0.80 - $1.25\t$0.70 - $1.00\t$18.00 - $5.00");
        System.out.println("A  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B");
        
        
        switch(option){
            case 1:
                System.out.println("Enter the name of the Product");
                name = sn.next();
                System.out.println("Select the cost");
                cost = sn.nextFloat();
                System.out.println("Select the Fabricator");
                fabricator = sn.next();
                electronicMaterial = new ElectronicMaterial(name,fabricator,cost);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonElectronicMaterial= gson.toJson(electronicMaterial);
            break;   
            case 2:
            break;
            case 3:
            break;    
            default: 
        }
        }while(option != 3);
        ElectronicMaterial em [] = new ElectronicMaterial[10];
        
        
        
        for(int i = 0; i < option; i++){
<<<<<<< HEAD
            System.out.println("Enter the name of the Product");
            name = sn.next();
            System.out.println("Select the cost");
            cost = sn.nextFloat();
            System.out.println("Select the Fabricator");
            fabricator = sn.next();
            em[i] = new ElectronicMaterial(name, fabricator, cost);
 
=======
            
>>>>>>> 61d3770a773b49708728c66b36737b58cf6b5e4a
        }  
        
       for(int i = 0; i<option; i++){
           System.out.println(em[i]);
       }
              
    }
}
