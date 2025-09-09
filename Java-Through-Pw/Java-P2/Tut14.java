// class Car implements Runnable{

// //  synchronized 
//  public void run(){
//         try {
            
            
//           synchronized (this) {
              
//               System.out.println(Thread.currentThread().getName()+"Has entered the parking lot");
//               Thread.sleep(2000);
//           }  
         
//          System.out.println(Thread.currentThread().getName()+" Got into car to drive");
//          Thread.sleep(2000);
//          System.out.println(Thread.currentThread().getName()+"Started to drive the car");
//          Thread.sleep(2000);
//          System.out.println(Thread.currentThread().getName()+"Come back and parked the car");
//          Thread.sleep(2000);

//         } 
        
//         catch (InterruptedException ex) {
//             System.out.println("Some problem");

//         }


//     }



// }
// public class Tut14 {

//     public static void main(String[] args) {
        
//         // ----------------------------Synchronization in Java(synchronized keyword)----------------

//         Car c = new Car();

//         Thread t1 = new Thread(c);
//         t1.setName("SON-1");
//         Thread t2 = new Thread(c);
//          t2.setName("SON-2");
//         Thread t3 = new Thread(c);
//          t3.setName("SON-3");

//          t1.start();
//          t2.start();
//          t3.start();




//     }
    
// }
