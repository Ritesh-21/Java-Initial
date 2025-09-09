
// import java.util.Scanner;

// public class Tut12 extends Thread {

//     public void run() {

//         String thread1 = Thread.currentThread().getName();

//         if (thread1.equals("Calc")) {
//             Calc();
//         } else {
//             impMsg();
//         }

//     }

//     public void Calc() {

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

//     public void impMsg() {

//         System.out.println("Imp msg. displaying Task begin");

//         for (int i = 0; i < 3; i++) {
//             System.out.println("Bahut jaruuri msg. hai ");
//             try {
//                 Thread.sleep(2000);
//             } catch (InterruptedException ex) {
//             }

//         }
//     }

//     public static void main(String[] args) {

//         //  "extends Thread vs implements Runnable and Limitations of invocking run() explicitly"

//         Tut12 t12 = new Tut12();
//         t12.setName("Calc");

//         Tut12 t13 = new Tut12();
//         t13.setName("PRINT");
        
//         t12.start();
//         t13.start();
//     }

// }
