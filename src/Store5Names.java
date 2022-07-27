import java.util.ArrayList;
import java.util.Scanner;

public class Store5Names {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a name: ");
            names.add(objScanner.nextLine());
        }
    }
}
