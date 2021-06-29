/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

/**
 *
 * @author LAMESTech ESPE-DCC0
 */
public class Interface {
    
   private boolean speed;
   private boolean safe;
   private String name;
   private String quantityOfMaterials;
   private String materialList;
   
    public Interface(boolean speed, boolean safe, String name, String quantityOfMaterials, String materialList) {
        this.speed = speed;
        this.safe = safe;
        this.name = name;
        this.quantityOfMaterials = quantityOfMaterials;
        this.materialList = materialList;
    }

    

    public boolean isSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(boolean speed) {
        this.speed = speed;
    }

    /**
     * @return the safe
     */
    public boolean isSafe() {
        return safe;
    }

    /**
     * @param safe the safe to set
     */
    public void setSafe(boolean safe) {
        this.safe = safe;
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
     * @return the quantityOfMaterials
     */
    public String getQuantityOfMaterials() {
        return quantityOfMaterials;
    }

    /**
     * @param quantityOfMaterials the quantityOfMaterials to set
     */
    public void setQuantityOfMaterials(String quantityOfMaterials) {
        this.quantityOfMaterials = quantityOfMaterials;
    }

    /**
     * @return the materialList
     */
    public String getMaterialList() {
        return materialList;
    }

    /**
     * @param materialList the materialList to set
     */
    public void setMaterialList(String materialList) {
        this.materialList = materialList;
    }

}