import java.util.ArrayList;
import java.util.Scanner;

public class fiveNamesAndAgesWithFunction {

    public static boolean IsOfAge(int age){
        if(age < 18) {
            System.out.println("Age less than 18.");
            return false;
        }
        else return true;
    }
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> ages = new ArrayList<Integer>();
        int counter = 0;
        while (counter < 5){


            System.out.print("Enter a name: ");
            String name = objScanner.next();

            System.out.print("Enter an age: ");
            int age = objScanner.nextInt();

            if(IsOfAge(age)){
                names.add(name);
                ages.add(age);
                counter++;
            }
        }
    }
}
