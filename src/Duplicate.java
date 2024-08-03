import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        for(int i=0;i<l.size();i++){
            for(int j=i+1;j<l.size();j++)
            {
                if(l.get(i).equals(l.get(j)))
                {
                    System.out.printf("%d is the first non duplicate element",l.get(i));
                }
            }

        }

    }
}
