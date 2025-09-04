import java.util.Scanner;
public class Tut31 {

  // Methods in Java

//    public static Void printmyname(String name ){
//         System.out.println(name);
//         return null;
//     }
//     public static void main(String[] args) {

//         // Methods in Java 

// try (Scanner sc = new Scanner ( System.in)) {
//     String name = sc.next();
//     printmyname(name); // function ko call kiya 
// }
   
//     }
// public static int calculatesum (int a , int  b ){
//     int sum = a+b;
//     return sum;


// }
// public static void main(String[] args) {

//   try ( Scanner sc = new Scanner ( System.in)){

//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     int sum = calculatesum(a, b);
//     System.out.println("The sum of two no. is "+sum);
    
// }

// }
    
// }

public static int calculatemul (int a , int  b ){
    int mul = a*b;
    return mul;
    // return a*b; yes it is valid 


}
public static void main(String[] args) {

  try ( Scanner sc = new Scanner ( System.in)){

    int a = sc.nextInt();
    int b = sc.nextInt();

    int mul = calculatemul(a, b); // iski bhi jarurat nahi hai directly fun ko sout karke bhi ho jaega

    System.out.println("The Multiplication of two numbers is "+mul);
    // System.out.println("The Multiplication of two numbers is "+calculatemul(a, b)); YES IT IS VALID
    
}

}
    
}











