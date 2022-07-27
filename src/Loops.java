import java.util.ArrayList;
import java.util.*;
public class Loops {

    public static void main(String[] args){

        ArrayList<String> names = new ArrayList<String>();
        Collections.addAll(names,new String[] {"Colin","Andrew","Drew","Neil"});

        for(String name : names){
            System.out.println(name);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        int i = 0;
        do{
            System.out.println(names.get(i));
            i++;
        } while(i < names.size());

        i = 0;
        while(i < names.size()){
            System.out.println(names.get(i));
            i++;
        }
    }
}
