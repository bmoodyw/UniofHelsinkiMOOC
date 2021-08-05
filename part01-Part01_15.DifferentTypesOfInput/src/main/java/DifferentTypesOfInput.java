
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        String strInput = scan.nextLine();
        
        System.out.println("Give an integer: ");
        int iInput = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double: ");
        double dInput = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean: ");
        boolean bInput = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + strInput);
        System.out.println("You gave the integer " + iInput);
        System.out.println("You gave the double " + dInput);
        System.out.println("You gave the boolean " + bInput);


//        System.out.println("Give a string:");
//        String bye = scanner.nextLine();
//        System.out.println("Give an integer:");
//        int integer = Integer.valueOf(scanner.nextLine());
//        System.out.println("Give a double:");
//        double floatingPoint = Double.valueOf(scanner.nextLine());
//        System.out.println("Give a boolean:");
//        boolean value = Boolean.valueOf(scanner.nextLine());
//        System.out.println("You gave the string " + bye);
//        System.out.println("You gave the integer " + integer);
//        System.out.println("You gave the double " + floatingPoint);
//        System.out.println("You gave the boolean " + value);
        // Write your program here

    }
}
