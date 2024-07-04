import java.util.Stack;;

public class stack {
    public static void main(String args[]){
        Stack<String> name = new Stack<>();
        name.add("Aaditya");
        name.add("Aakash");
        name.add("Prem");
        name.add("Rushikesh");
        System.out.println(name);
        // peek is use to see the element at the top of stack
        System.out.println(name.peek());
        // pop the element from the stack
        System.out.println(name.pop());
        System.out.println(name);

    }
}
