class Student{
private  int age;
private  String name;

public void setData(){

    age=31;
    name="mike";

}

public void show(){
    System.out.println(age+" "+name);
}

}
public class Tut1 {

    //Encapsulation 
    public static void main(String[] args) {

        Student ss = new Student();
        // ss.age=18;
        ss.setData();
        ss.show();
        
    }
    
}
