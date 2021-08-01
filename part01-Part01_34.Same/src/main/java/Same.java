
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String same = scan.nextLine();
        
        System.out.println("Enter the second string:");
        String same2 = scan.nextLine();
        
        System.out.println("");
        if (same.equals(same2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        // Write your program here. 
    }
}
