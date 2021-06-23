/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

import java.util.ArrayList;

/**
 *
 * @author LAMESTech ESPE-DCC0
 */
public class ElectronicMaterial {
    private String name;
    private String color;
    private float cost;
    private String typeOfMaterial;
    private ArrayList<Information>information = new ArrayList <>();

    ElectronicMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ElectronicMaterial{" + "name=" + getName() + ", color=" + getColor() + ", cost=" + getCost() + ", typeOfMaterial=" + getTypeOfMaterial() + ", information=" + getInformation() + '}';
    }

    public ElectronicMaterial(String name, String color, String typeOfMaterial) {
        this.name = name;
        this.color = color;
        this.typeOfMaterial = typeOfMaterial;
    }
   
    public static void searchInformation(){
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the typeOfMaterial
     */
    public String getTypeOfMaterial() {
        return typeOfMaterial;
    }

    /**
     * @param typeOfMaterial the typeOfMaterial to set
     */
    public void setTypeOfMaterial(String typeOfMaterial) {
        this.typeOfMaterial = typeOfMaterial;
    }

    /**
     * @return the information
     */
    public ArrayList<Information> getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(ArrayList<Information> information) {
        this.information = information;
    }
}
