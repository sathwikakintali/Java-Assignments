import java.util.*;
public class StackInJava {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(3);
        s.push(4);
        s.push(9);
        s.push(8);
        s.push(6);
        s.push(7);
        while(!s.isEmpty())
        {
            System.out.println(s.pop());
        }
    }
}
