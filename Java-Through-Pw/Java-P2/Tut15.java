// class libraby implements Runnable{

//     String res1 = new String("JAVA");
//     String res2 = new String("SQL");
//     String res3 = new String("DBMS");

//     public void run(){

//         String name1 = Thread.currentThread().getName();

//         if(name1.equals("Student-1")){

//             try {
//                 Thread.sleep(2000);
//                 synchronized(res1){
//                     System.out.println("Student-1 has acc "+res1);

//                     Thread.sleep(2000);

//                    synchronized (res2){
//                      System.out.println("Student-1 has acc "+res2);
//                      Thread.sleep(2000);

//                      synchronized (res3){
//                              System.out.println("Student-1 has acc "+res3);


//                      }

//                    }
//                 }
//             } catch (Exception e) {
//             System.out.println("Something went wrong");
//             }


        
//         }
//         else{


//             try {
//                 Thread.sleep(2000);
//                 synchronized(res3){
//                     System.out.println("Student-2 has acc "+res3);

//                     Thread.sleep(2000);

//                    synchronized (res2){
//                      System.out.println("Student-2 has acc "+res2);
//                      Thread.sleep(2000);

//                      synchronized (res1){
//                              System.out.println("Student-2 has acc "+res1);


//                      }

//                    }
//                 }
//             } catch (Exception e) {
//             System.out.println("Something went wrong");
//             }



//         }



//     }
// }

// public class Tut15 {

//     public static void main(String[] args) {
        
//         // ------------------------------ Dead lock-----------------------------

//         libraby ll = new libraby();

//         Thread t1 = new Thread(ll);
//         t1.setName("Student-1");
//         Thread t2 = new Thread(ll);
//         t2.setName("Student-2");

//         t1.start();
//         t2.start();

//     }
    
// }
