import java.util.ArrayList;
import java.util.Scanner;

public class Store5Numbers {
    //Intentionally without a look
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner objScanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        numbers.add(objScanner.nextInt());

        System.out.print("Enter a number: ");
        numbers.add(objScanner.nextInt());

        System.out.print("Enter a number: ");
        numbers.add(objScanner.nextInt());

        System.out.print("Enter a number: ");
        numbers.add(objScanner.nextInt());

        System.out.print("Enter a number: ");
        numbers.add(objScanner.nextInt());
    }
}
