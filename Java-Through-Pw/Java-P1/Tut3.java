class student{

    int age;
    String name;

    public student(int age , String name) {
        this.age=age;
        this.name=name;
    }

    
    public int getAge() {
        return age;
    }
   
    public String getName() {
        return name;
    }
    

    
}
public class Tut3 {

    // Constructor 

    public static void main(String[] args) {
        student ss = new student(31,"Mike");
        System.out.println(ss.getAge() + " " + ss.getName());
    
        student ss1 = new student(21,"rike");
        System.out.println(ss1.getAge() + " " + ss1.getName());
    }
    
}
