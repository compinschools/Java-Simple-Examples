import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner objScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = objScanner.nextLine();
        name = name.toUpperCase();
        System.out.println("Your Name is " + name);
    }
}
