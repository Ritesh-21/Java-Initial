
import java.util.*;

public class Tut3 {

    public static void main(String[] args) {
        
        // List<Integer> list1 = new ArrayList<Integer>();

        // list1.add(20);
        // list1.add(22);
        // list1.add(2);
        // list1.add(23);
        // System.out.println(list1);

        List<Integer> l2 = Arrays.asList(2,4,6,8);
        System.out.println(l2);

        // for (Integer i : l2) { // External way to Iterarte the data 
        //     System.out.println(i);
            
        // }

        l2.forEach(n->System.out.println(n)); // Again Learn 
    }
    
}
