
// import java.util.Scanner;

// class Calc extends Thread {

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

// class Message extends Thread {

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

// public class Tut10 {

//     public static void main(String[] args) {

//          // More on creating Multiple 

//          Message t1 = new Message();
//          t1.start();

//          Calc t2  = new Calc();
//          t2.start();


//     }

// }
