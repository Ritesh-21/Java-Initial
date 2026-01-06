
class Memo implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {

            try {

                System.out.println("Stayed Focused");
                // Thread.sleep(2000);

            } catch (Exception e) {
                System.out.println("!!!Kuch to gadbad hai re deva !!!");
            }
        }

    }

}

public class Tut12 {

    public static void main(String[] args) {

        Memo m = new Memo();

        Thread t = new Thread(m);
        t.start();
        t.interrupt();

    }

}
