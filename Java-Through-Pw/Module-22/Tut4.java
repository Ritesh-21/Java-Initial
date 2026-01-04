
import java.util.Scanner;

class Calc extends Thread {

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

class Message extends Thread{

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


public class Tut4 {  
    public static void main(String[] args) {
        // More On Creating Multiple Threads 

        System.out.println("Main Thread is Starting ");

        Calc t1 = new Calc();

        Message t2 = new Message();

        t1.start();
        t2.start();


        
    }
    
}
