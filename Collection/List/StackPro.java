import java.util.*;

class StackPro{
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // adding/pushing elements in stack
        stack.push("Aishwarya");
        stack.push("SDE");
        stack.push("Google");
        stack.pop();
        // travers throw it
        Iterator itr = stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"-");
        }

        // remove element from stack

        
        // while(itr.hasNext()){
        //     System.out.print(itr.next()+"-");
        // }
    }
}