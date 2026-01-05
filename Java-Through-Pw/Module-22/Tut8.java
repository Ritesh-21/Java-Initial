
class Demo implements Runnable {

    @Override
    public void run() {
        System.out.println("Child class THread is Running ");
        try {
            // Thread.sleep(3000);

        } catch (Exception e) {
            System.out.println("Something Went Wrong ");
        }

        System.out.println("Child Class THread Kaam Complete ");
    }

}

public class Tut8 {

    public static void main(String[] args) {
        System.out.println("Main Thread is Running ");

        Demo dd = new Demo();

        Thread t1 = new Thread(dd); // yahan par Thread ko life nahi milti hai

        t1.start(); // Thraed ko life yahan milti hai 
    }

}
