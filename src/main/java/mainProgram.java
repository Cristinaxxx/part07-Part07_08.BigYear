
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);        
        
        UserInterface ui = new UserInterface(scan);
        
        System.out.println("Printing main1");
        ui.start();
        
        System.out.println("Printing main2");

    }

}
