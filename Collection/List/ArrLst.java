import java.util.*;

public class ArrLst {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        // adding elements in AL

        al.add(12);
        al.add(13);
        al.add(20);

        // trversing AL using iterator interface

        Iterator itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
