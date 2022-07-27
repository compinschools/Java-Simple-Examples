import java.util.Scanner;

public class IfStatement
{
    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        System.out.print("Enter x: ");
        x = objScanner.nextInt();
        System.out.print("Enter y: ");
        y = objScanner.nextInt();

        if(x == y) {
            System.out.println("x is the same as y");
        } else if (x < y ) {
            System.out.println("x is less than y");
        } else {
            System.out.println("x is more5 than y");
        }
    }
}
