
// import java.util.Scanner;

// class Calc implements Runnable {

//     public void run() {
//         System.out.println("Calculation Task is Begin");

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first Number");
//         int num1 = sc.nextInt();

//         System.out.println("Enter the Second Number");
//         int num2 = sc.nextInt();

//         int res = num1 + num2;

//         System.out.println("The result of num1 and num2 : " + res);

//         System.out.println("Calculation Task is End");

//     }
// }
// class Message implements Runnable {

//     public void run() {

//         System.out.println("Imp msg. displaying Task begin");

//         for (int i = 0; i < 3; i++) {
//             System.out.println("Bahut jaruuri msg. hai ");
//             try {
//                 Thread.sleep(2000);
//             } catch (InterruptedException ex) {
//             }

//         }

//         System.out.println("Imp msg. displaying Task End");
//     }
// }
// public class Tut11 {

//     public static void main(String[] args) {
        
//         // Creating Threads by implementing Runnable interface

//         Message t1 = new Message();

//         Calc c1 = new Calc();

//         Thread tt = new Thread(t1);
//         tt.start();

//         Thread ff = new Thread(c1);
//         ff.start();
        


//     }
    
// }
