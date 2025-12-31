
import java.util.*;
import  java.util.stream.*;

public class Tut4 {  


    public static void main(String[] args) {

        // Introduction To Stream ApI in JaVa 

        List<Integer> list =  Arrays.asList(2,3,4,5,6);

        Stream<Integer> std=list.stream();

        std.forEach(n->System.out.println(n));

        // Ek Stream par ek baar mai ek hi operation ho sakta hai 

        
    }
    
}
