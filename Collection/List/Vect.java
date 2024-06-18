import java.util.*;

public class Vect {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        // adding elements in Vector
        v.add("Microsoft");
        v.add("Google");
        v.add("Amazon");

        // traversing Vector using iterator

        Iterator<String> itr = v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
