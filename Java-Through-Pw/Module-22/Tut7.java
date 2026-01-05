
import java.util.Scanner;

class Mythread extends Thread{

@Override
public void run(){  

    String st = Thread.currentThread().getName();
    if (st .equals("CALC")) {
        Calc();
        
    } else {

        impmsg();
        
    }

    


}

public void Calc(){

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
public  void impmsg(){
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

public class Tut7 {  
    public static void main(String[] args) {

        System.out.println("MAIN Thread is Staring");

        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.setName("CALC");
        t2.setName("PRINT");
    

        t1.start();
        t2.start();
        
    }
    
}
