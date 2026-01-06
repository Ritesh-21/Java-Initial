class kittu implements Runnable{

   //synchronized
     @Override
     public void run(){ 

        
        try {
            System.out.println(Thread.currentThread().getName()+"Has entered the parking lot");
            // Thread.sleep(2000);

            synchronized (this) {
                
            
            

                System.out.println(Thread.currentThread().getName()+"Got into car to drive ");
                // Thread.sleep(2000);
                
                System.out.println(Thread.currentThread().getName()+"Started to drive the car");
                // Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName()+"Come back and parked the car");
                
                
            }
            
            
        } catch (Exception e) {

            System.out.println("Kuch to gadbad hai re baba ");
        }
    }
}
public class Tut10 {  
    public static void main(String[] args) {

        // Synchronization in Java 

        kittu tt = new kittu();

        Thread t1 = new Thread(tt);
        Thread t2 = new Thread(tt);
        Thread t3 = new Thread(tt);

        t1.setName("SON-1");
        t2.setName("SON-2");
        t3.setName("SON-3");

        t1.start();
        t2.start();
        t3.start();

        

        
    }
    
}
