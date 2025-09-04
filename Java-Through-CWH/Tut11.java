import java.util.Scanner;
public class Tut11 {

    public static void main(String[] args) {

        // Exercise - 1 Solution

        try (Scanner KR7 = new Scanner(System.in)) {
            System.out.println("Enter the value of 1st Subject");
            int a = KR7.nextInt();
            System.out.println("Enter the value of 2nd Subject");
            int b = KR7.nextInt();
            System.out.println("Enter the value of 3rd Subject");
            int c = KR7.nextInt();
            System.out.println("Enter the value of 4th Subject");
            int d = KR7.nextInt();
            System.out.println("Enter the value of 5th Subject");
            int e = KR7.nextInt();

            float total = (a+b+c+d+e)/5;
            System.out.print("Honey Bhai ke percentage :");

            System.out.println(total);
        
    }
    
} }
