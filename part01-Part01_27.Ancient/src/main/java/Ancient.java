
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.println("Give a year:");
        int year = scan.nextInt();
        
        System.out.println("");
        if (year < 2015 ) {
            System.out.println("Ancient history!");
        }// end of if

       
    }// end of main method
}// end of class
