class demo{
private int a;
private int b;

demo(){
System.out.println("Zero parametrazied Constructor by programmer");
    
}

demo(int a,int b){

    this.a=a;
    this.b=b;
}

void display(){
    System.out.println(a);
    System.out.println(b);
}

// public int kd (){

//     return a+b;
// }

}

public class Const2 {   

public static void main(String[] args) {

    demo obj = new demo();
    obj.display();


    demo obj1 = new demo(54,67);
    obj1.display();

   // System.out.println("The sum of two value is "+obj1.kd());

    
    
}
}
