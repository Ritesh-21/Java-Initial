
import java.util.Scanner;

class Calc1 implements Runnable {

    @Override
    public void run(){

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
    }


}

class Message1 implements Runnable{

    @Override
    public void run(){
        System.out.println("Displaying Imp Task");

        try{


            for (int i = 0; i < 3; i++) {
                System.out.println("Alert Alert Alert Alert  ");
                // Thread.sleep(2000);
                
            }
        }

        catch(Exception e){
            System.out.println("Kuch to gadbadd hai deva ");
        }
        System.out.println("Disply task khatam ");




    }
}
public class Tut5 { 
    
    public static void main(String[] args) {

        System.out.println("Main Thread Starting ");

        Calc1 c1 = new Calc1();

        Message1 m1 = new Message1();

        Thread t1 = new Thread(c1);

        Thread t2 = new Thread(m1);

        t1.start();
        t2.start();
    
}
    
}
