class Human1{

int age;
//private String name ;

Human1() // Constructor Creation 
{

    System.out.println("HUman Class Constructor");
}

void sleep(){

    age = 31;
    System.out.println("Human needs a good Sleep");
    System.out.println(age);
}

}
class Student1 extends Human1

// public student1 ()
//{
// super();
// }
 {
void disp(){
System.out.println("My age is "+age);
// System.out.println(" My name is "+name);

}

}

public class Tut208 {
    public static void main(String[] args) {
        
        // More on Inheritance 

        Student1 st1 = new Student1();

        st1.sleep();
        // st.disp();
        st1.disp();


    }
    
}
