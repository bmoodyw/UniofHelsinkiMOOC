
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Password?");
        String passcode = scan.nextLine();
        
        System.out.println("");
        if (passcode.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else if (passcode.equals("password") {
            System.out.println("Off with you!");
        } else {
            System.out.println("you're god!");
        }
    
    
    
    }
}