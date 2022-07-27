import java.util.Scanner;

public class FunctionsWithReturnType {
    public static boolean CheckX(int x) {

        if(x < 0) return false;
        switch(x){
            case 1:
                System.out.println("You entered one");
                break;
            case 2:
                System.out.println("You entered two");
                break;
            case 3:
                System.out.println("You entered three");
                break;
            case 4:
                System.out.println("You entered four");
                break;
            case 5:
                System.out.println("You entered something else");
                break;
        }

        return true;
    }


    public static void main(String[] args) {

        Scanner objScanner = new Scanner(System.in);
        int x = 0;

        boolean complete = false;
        while (!complete) {
            System.out.print("Enter x: ");
            x = objScanner.nextInt();

         complete = CheckX(x);
        }
    }
}
