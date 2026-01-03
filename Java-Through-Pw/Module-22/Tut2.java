public class Tut2 {
    
public static void main(String[] args) {

    System.out.println("Main THread ");
    System.out.println("Before Changing ");

    String nn =Thread.currentThread().getName();
    System.out.println("The Name of main Thread is"+ nn);
    System.out.println("The Priority of Main Thread is "+Thread.currentThread().getPriority());

    System.out.println("After Changing ");

   Thread t = Thread.currentThread();
   t.setName("Jugg");
   t.setPriority(7);
   String tt =Thread.currentThread().getName();
   System.out.println("The Name of main Thread is"+ tt);
   System.out.println("The Priority of Main Thread is "+Thread.currentThread().getPriority());

    
}
}
