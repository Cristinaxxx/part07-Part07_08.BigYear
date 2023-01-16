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

    Database database = new Database();

    
    public void start() {
 
        printCommands();

        boolean flag = true;
        
        while(flag) {
            System.out.print("?");
            String command = scanner.nextLine();

            switch(command) {

                case "Quit":
                    flag = false;

                case "Add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();
                    Bird bird = new Bird(name, latinName);
                    database.add(bird);
                    break;
                case "Observation":
                    System.out.println("Bird?");
                    String birdName = scanner.nextLine();
                    database.addObservation(birdName);
                    break;
                case "All":
                    database.printAll();
                    break;
                case "One":
                    System.out.println("Bird?");
                    String birdToPrint = scanner.nextLine();
                    database.printOne(birdToPrint);
                    break;
                default:
                    System.out.println("Enter a valid command");

            }


  /*          if(command.equals("Quit")) {
                break;
            }
            if(command.equals("Add")) {
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
            if(command.equals("All")) {
                database.printAll();
            }
            if(command.equals("One")) {
                System.out.println("Bird?");
                String birdName = scanner.nextLine();
                database.printOne(birdName);
            } */
        }
        
    }
    
    public void printCommands() {
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");     
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
    }
    
    
}
