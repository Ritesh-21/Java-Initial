class Demo1 {
int a , b;
public Demo1(){
System.out.println("Parent class Constructor");
}

public Demo1(int x , int y){
System.out.println("Paramaterized parent class constructor");

}
}

class Demo2 extends Demo1 {
int m , n ;

public Demo2(){
    super(10 , 43);

    System.out.println("Child class constructor");
}
public Demo2(int x , int y){
    System.out.println("Paramaterized child class constructor");
    m=x;
    n=y;
}


}
public class Tut213 {
    public static void main(String[] args) {

      //  Demo2 dd = new Demo2();
      //  Demo2 d2 = new Demo2(10 , 34);
        
    }
    
}