
// import java.util.ArrayList;

public class Tut26 {

    public static void main(String[] args) {
        
        // Generics in Java
     // TypeSafety
      //  String ss [] = new String[5];

        // ss[0]="Banrakas";
        // ss[1]="Manju Devi";
        // ss[2]="Pintu";
        // ss[3]= 04; Not Allowed

      //  String name = ss[0]; // pata hai ki iska data type String hai isliye downcaste ka jhanjahat nahi
     //   String name1 = ss[1];

        // System.out.println(name+ name1);

        // No typesafety
        //Typesafety Achived using Generics 

      //  ArrayList<String> ar = new ArrayList<String>();

        // ar.add("Banrakas");
        // ar.add("Manju Devi");
        // ar.add(73);

        // System.out.println(ar); ye print hota hai 
      //  String n1 = (String)ar.get(0); // Typecasting 
      //  String n2 = (String)ar.get(1);
      //  String n3 = (String)ar.get(2);
    }
    
}
