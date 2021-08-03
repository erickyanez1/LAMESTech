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
public class Owner {
    private String name;
    private String lastName;
    private int age;
    private String gender;
    
    public static void monitorInInformation(){
     
    }

    @Override
    public String toString() {
        return "Owner{" + "name=" + name + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender + '}';
    }

    public Owner(String name, String lastName, int age, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
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
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    
}
