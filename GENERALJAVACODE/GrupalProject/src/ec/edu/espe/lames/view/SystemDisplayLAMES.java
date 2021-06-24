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
        
            
    }
}
