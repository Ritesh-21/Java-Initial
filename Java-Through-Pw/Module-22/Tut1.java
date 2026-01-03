
import java.util.Scanner;

public class Tut1 {

    public static void main(String[] args) {

        System.out.println("Calculation Task Started");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the 1st number ");
            int num1 = sc.nextInt();

            System.out.println("Enter 2nd number ");
            int num2 = sc.nextInt();

            int res = num1 + num2;
            System.out.println("Result aa gaya bhaiya "+res);
        }
        System.out.println("Calculation Task Ended ");
        System.out.println("88888888888888888888888888888888888");
        System.out.println("Printing Task Exexcuted ");
        for (int i = 0; i < 4; i++) {
            System.out.println("*");

        }
        System.out.println("Printing task khatam ");
        System.out.println("Displaying Imp Task");
        for (int i = 0; i < 3; i++) {
            System.out.println("Alert Alert Alert Alert  ");
            
        }
        System.out.println("Disply task khatam ");

    }

}
