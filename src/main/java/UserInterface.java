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
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }
    
    ArrayList<Bird> arrayList = new ArrayList<>();
    Database database = new Database(arrayList);

    
    public void start() {
 
        printCommands();
        
        System.out.println("Printing 1");
        
        
        while(true) {
            System.out.print("?");
            String command = scanner.nextLine();
            if(command.equals("quit")) {
                break;
            }
            if(command.equals("add")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scanner.nextLine();
                Bird bird = new Bird(name, latinName);
                database.add(bird);
            }
            if(command.equals("Observation")) {
                System.out.println("Bird?");
                String birdName = scanner.nextLine();                
                database.addObservation(birdName);
            }
            if(command.equals("all")) {
                database.printAll();
            }
            if(command.equals("one")) {
                System.out.println("Bird?");
                String birdName = scanner.nextLine();
            }
        }
        
        System.out.println("Printing 2");
    }
    
    public void printCommands() {
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");     
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
    }
    
    
}
