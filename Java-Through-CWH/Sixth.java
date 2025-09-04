import java.util.Scanner;
public class Sixth {
    public static void main(String[] args) {

        // Java Program Exercise - 1 to Calculate Percentage of Five Subjects

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
            System.out.print("Drake Bhai ke percentage :");

            System.out.println(total);
        }




        
    }
    
}
