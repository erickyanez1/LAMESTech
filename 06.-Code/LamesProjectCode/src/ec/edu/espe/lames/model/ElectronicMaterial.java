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
    private String Product;
    private String Fabricator;
    private int Id;
    private int Quantity;
    private int Price;

    public ElectronicMaterial(String name, String fabricator, float cost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "ElectronicMaterial{" + "Product=" + Product + ", Fabricator=" + Fabricator + ", Id=" + Id + ", Quantity=" + Quantity + ", Price=" + Price + '}';
    }

    public ElectronicMaterial(String Product, String Fabricator, int Id, int Quantity, int Price) {
        this.Product = Product;
        this.Fabricator = Fabricator;
        this.Id = Id;
        this.Quantity = Quantity;
        this.Price = Price;
    }

    /**
     * @return the Product
     */
    public String getProduct() {
        return Product;
    }

    /**
     * @param Product the Product to set
     */
    public void setProduct(String Product) {
        this.Product = Product;
    }

    /**
     * @return the Fabricator
     */
    public String getFabricator() {
        return Fabricator;
    }

    /**
     * @param Fabricator the Fabricator to set
     */
    public void setFabricator(String Fabricator) {
        this.Fabricator = Fabricator;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Quantity
     */
    public int getQuantity() {
        return Quantity;
    }

    /**
     * @param Quantity the Quantity to set
     */
    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String[] getArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
