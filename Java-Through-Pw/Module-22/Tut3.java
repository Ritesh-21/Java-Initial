class Myclass extends Thread{

    @Override
    public void run(){

        System.out.println("Dilda ni mada terra siddhu moosewala ");
    }


}

public class Tut3 {

    public static void main(String[] args) {
        System.out.println("Kal Jiala Wich Gaya saade kon ");

        Myclass t = new Myclass();
        t.start();
    }
    
}
