/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */
public class Bird {
    
    private String name;
    private String latinName;
    int observationCount;
    
    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observationCount = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public void setLatinName(String latinName) {
        this.latinName = latinName;
    }
    
    public void observation() {
        this.observationCount++;
    } 
    
    public String toString() {
        if(this.observationCount == 1) {
            return this.name + " (" + this.latinName + "): " + this.observationCount + " observation";
        } else return this.name + " (" + this.latinName + "): " + this.observationCount + " observations";
    } 
    
}
