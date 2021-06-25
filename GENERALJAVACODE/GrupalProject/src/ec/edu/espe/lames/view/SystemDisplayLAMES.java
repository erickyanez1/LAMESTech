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
        System.out.println("Owners\n- Leslie Titoaña\n- Solange Tupiza\n- Alina Villavicencio\n- Erick Yánez\n- María Yugsi\n");

        String name;
        String fabricator;
        float cost;
        String jsonElectronicMaterial = "";

        ElectronicMaterial electronicMaterial[] = new ElectronicMaterial[10];

        Scanner sn = new Scanner(System.in);
        int option;
        FileWriter file = new FileWriter("./files/ElectronicMaterial.json");

        do {
            System.out.println("1. Product List");
            System.out.println("2. Select products and save to Json");
            System.out.println("3. Select products and save to CSV");
            System.out.println("4. Exit");

            option = sn.nextInt();

            switch (option) {
                case 1:

                    System.out.println("9VBattery\tLEDDiodes\tResistor\tIntegratedCircuit");
                    System.out.println("$3.00 - $2\t$0.25 - $0.50\t$0.20 - $0.30\t$0.80 - $1.50");
                    System.out.println("A  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B\t");
                    System.out.println("\nDipswitch\tCapacitor\tPotentiometer\tTransistor\tProtoboard");
                    System.out.println("$0.70 - $1.20\t$0.60 - $1.00\t$0.80 - $1.25\t$0.70 - $1.00\t$18.00 - $5.00");
                    System.out.println("A  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B");
                    System.out.println("\nMultimeter\tUTPCable\tLizardWire\tArduinos");
                    System.out.println("$15.00 - $50.00\t$0.40 - $1.30\t$0.35 - $1.25\t$7.00 - $14.00");
                    System.out.println("A  -  B\t\tA  -  B\t\tA  -  B\t\tA  -  B\t\n");

                    break;
                
                
                    
                case 3:
                    //CSV FILE
                    
                    
                    break;
                case 4:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (option != 3);

    }
}
