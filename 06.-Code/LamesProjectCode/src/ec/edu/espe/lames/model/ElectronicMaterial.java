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
    private String fabricator;
    private float cost;

    @Override
    public String toString() {
        return "ElectronicMaterial{" + "name=" + name + ", fabricator=" + fabricator + ", cost=" + cost + '}';
    }

    public ElectronicMaterial(String name, String fabricator, float cost) {
        this.name = name;
        this.fabricator = fabricator;
        this.cost = cost;
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
     * @return the fabricator
     */
    public String getFabricator() {
        return fabricator;
    }

    /**
     * @param fabricator the fabricator to set
     */
    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
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
    public String [] getArray(){
        String [] information = {name,fabricator,String.valueOf(cost)};
        return information;
    }

   
}
