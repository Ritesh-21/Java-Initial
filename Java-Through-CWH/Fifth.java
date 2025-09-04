import java.util.Scanner;

public class Fifth {

    public static void main(String[] args) {

        // Getting User Input in Java
        
try (Scanner KR = new Scanner(System.in)) {
    System.out.println("Enter the value of num1");
    int a = KR.nextInt();
    System.out.println("Enter the value of num2");
    int b = KR.nextInt();
    int sum = a+b;
    System.out.print(" The Sum of two number is :");
    System.out.println(sum);
}
    }


    
}
