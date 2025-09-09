// class Printing implements Runnable{

//     public void run(){

//         try {
//             for (int i = 0; i < 2; i++) {
//                 System.out.println("This is important message");
//                 Thread.sleep(3000);
                
//             }
            
//         } catch (Exception e) {
//            System.out.println("Something wrong");
//         }


//     }



// }

// public class Tut13 {

//     public static void main(String[] args) throws  Exception {

// ----------------------------- join() and isAlive() methods--------------------------

//         System.out.println("Main Thread Start");

//         Printing p = new Printing();

//     Thread tt = new Thread(p);
//     System.out.println("aabhi ni bana :"+tt.isAlive()); // false
//     tt.start();
//     System.out.println("Ab ban gaya "+tt.isAlive()); // true 
//     tt.join();

//     System.out.println("Main Thread End");
        
//     }
    
// }
