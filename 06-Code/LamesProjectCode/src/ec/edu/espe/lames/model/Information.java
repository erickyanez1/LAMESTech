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

public class Information {
    private String info;

    @Override
    public String toString() {
        return "Information{" + "info=" + info + '}';
    }

    public Information(String info) {
        this.info = info;
    }
    
       
    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }
    
    
    
}
