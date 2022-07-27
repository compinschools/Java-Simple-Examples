import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int i = 0;
        while (i < 5) {
            System.out.println("Enter a number:");
            numbers.add(objScanner.nextInt());

            i++;
        }

        for (int j = 0; j < numbers.size(); j++) {
            for (int k = j; k < numbers.size(); k++) {
                if(numbers.get(j) < numbers.get(k)){
                    int temp = numbers.get(k);
                    numbers.set(k,numbers.get(j));
                    numbers.set(j,temp);
                }

            }

        }
        System.out.println(numbers);
    }
}
