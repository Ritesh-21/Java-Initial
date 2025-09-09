class demo{

    private  int a;
    private int b ;

    public demo() {

        System.out.println("Zero paramaterized constructor called");
    }

public demo(int a, int b){
    this.a=a;
    this.b=b;
}

    public void disp(){

        System.out.println(a);
        System.out.println(b);
    }

    
}
public class Tut4 {
    
// more on constructure
    public static void main(String[] args) {

        demo d = new demo();
        d.disp();

        demo dd = new demo(21,31 );
        dd.disp();
        
    }
}
