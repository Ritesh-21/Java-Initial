class Employee {

// Basic Qualities on Object Oriented Programming

  // Creating Our own Java Class

    int id;
    String name;
    int salary;

   public void printmyname(){
System.out.println("My id is "+id);
System.out.println("My name is "+name);
System.out.println(" My salary is "+salary);

    }
     
    // public int getsalary(){
    //     return salary;
    // }

}

public class Tut38 {

    // Our first Custom Class

    // ek java PUBLIC class ke ander to ho jaega bahar nahi hoga  dusrii class ko PUBLIC karke nahi bana sakte
    // agar kisi class ka object bana na hai to class name the obj name equal to new
    // class name ();

    public static void main(String[] args) {

        System.out.println(" This is our first custom class");

        Employee clouds = new Employee(); // Instantiating a new Employee Object
        // Setting Properties , Attributes
        clouds.id = 20;
        clouds.name = "Kitretsu";
        clouds.salary = 10000;



Employee Miksu = new Employee();

Miksu.id = 21;
Miksu.name = "Miyoko";
Miksu.salary = 20000;



        // printing the attributes 

      //  System.out.println(clouds.id);
       //  System.out.println(clouds.name);




       // calling with the help of Object

       clouds.printmyname();

       Miksu.printmyname();
       

    }

}
