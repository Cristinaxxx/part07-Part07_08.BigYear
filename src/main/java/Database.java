/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crist
 */

import java.util.ArrayList;


public class Database {
    
    private ArrayList<Bird> birdDatabase;
  
    
    public Database() {
        this.birdDatabase = new ArrayList<Bird>();
    } 
    
    public void add(Bird bird) {
        this.birdDatabase.add(bird);
    }
    
    public void addObservation(String birdName) {
        for(Bird bird : this.birdDatabase) {
            if(bird.getName().toLowerCase().equals(birdName.toLowerCase())) {
                bird.observation();
            }
        }
    }
    
     public void printAll() {
        for(Bird bird: this.birdDatabase) {
            System.out.println(bird.toString());
        }
    }
     
      public void printOne(String birdName) {
        for(Bird bird: this.birdDatabase) {
            if(bird.getName().toLowerCase().equals(birdName.toLowerCase()))
                System.out.println(bird.toString());
        }
    }
}
