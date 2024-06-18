import java.util.*;

public class linkLst{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        // adding elements in ll

        ll.add(12);
        ll.add(13);
        ll.add(20);

        // trversing ll using iterator interface

        Iterator itr = ll.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}