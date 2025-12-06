//package Inheritance;
class Human {

    int age;

    void sleep(){

        age=21;
        System.out.println("HUman needs a good Sleep");
        System.out.println(age);

    }

}
class Student extends Human
{

}

public class Tut207 {
    public static void main(String[] args) {

        // Introduction to INHERITANCE  

        Student st = new Student();
        st.sleep();
        
    }
}
