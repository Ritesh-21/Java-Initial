import java.util.Scanner;

public class Tut18 { 
    public static void main(String[] args) {

// IF ELSE LADDER & Switch Case in 
 
        int age; 
        System.out.println("Enter your age");
      try  (Scanner sc = new Scanner(System.in)){
        age = sc.nextInt();
        if (age>21) {
System.out.println("You are Senior citizion now !!");
        }
else{

    System.out.println("You are young now !!");
}

    }


// System.out.println("Enter your age");
// int age;
// Scanner G1 = new Scanner (System.in);
// age=G1.nextInt();
// switch (age) {
//     case 18 :
//         System.out.println("You are Adult Now");
//         break;

//         case 21 :
//         System.out.println("Its Ritti Birthday");
//         break;
//         case 31 :
//         System.out.println("its mickey's birthday");
//         break;

//     default:
//     System.out.println("Ajj kisi ka birthday nahi hai");
//         break;

// // Enhanced Switch don't require BREAK; 
// // Syntax    SWITCH(CONDITION){CASE "VALUE"-> SOUT}


// }





}
}