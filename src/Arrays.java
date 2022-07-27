public class Arrays {

    public static void main(String[] args){
        String[] names = {"Colin","Andy","Drew","Neil"};
        names[1] = "Andrew";
        for(String name: names){
            System.out.println(name);
        }
    }
}
