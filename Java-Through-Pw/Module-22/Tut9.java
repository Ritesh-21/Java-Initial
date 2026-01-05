
class Mouse implements Runnable{

    @Override
    public void run(){

try { 
    for (int i = 0; i < 3; i++) {
        System.out.println("Stay Focused on your Work");
        // Thread.sleep(3000);
        
    }
    
} catch (Exception e) {
    System.out.println("Kuch to gadbaad hai ree baba ");
}


    }



}
public class Tut9 {  
    public static void main(String[] args) throws Exception

    // Join() & IsAlive() Method 
    {

        System.out.println("Main Thread is Starting "); 

        Mouse mm = new Mouse();

        Thread t = new Thread(mm);
        System.out.println(t.isAlive()); // False 

        t.start();
        System.out.println(t.isAlive()); // True 
        t.join();

        System.out.println("Main Thread is Ending ");
        
    }
    
}
