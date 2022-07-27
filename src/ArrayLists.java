import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Colin");
        names.add("Andy");
        names.add("Drew");
        names.add("Neil");
        names.set(1,"Andrew");
        System.out.println(names);
    }
}
