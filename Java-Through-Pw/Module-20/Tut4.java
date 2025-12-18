import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {

int marks ;
int age ;
String name ;

public Student(int age, int marks , String name ){
    this.age = age;
    this.name = name;
    this.marks = marks; 


}
public int getMarks(){
    return marks;
}

public int getAge(){
    return age;
}
public String getName() {
    return name;
}

public String toString(){
    return " " + marks + " " + age + " " + name;
}

public int compareTo(Student a){ // Comparable 
    if(this.age<a.age)
    return 1;
    else 
    return -1 ;


}

}

// class Alpha implements Comparator<Student>{
//     public int compare(Student a , Student b ){
//         if(a.age>b.age)
//         return 1;
//         else 
//         return -1 ;


//     }


// }
public class Tut4 {

    // Comparable Vs Comparator 

    public static void main(String[] args) {

        Student St1 = new Student(18, 45, "Rohan");
        Student St2 = new Student(17, 46, "Rohit");
        Student St3 = new Student(19, 44, "Mehu");

        List <Student> list = new ArrayList<Student>();
        list.add(St1);
        list.add(St2);
        list.add(St3);

        System.out.println(list);

        // Collections.sort(list);

        // Alpha a = new Alpha(); 


        //  Comparator<Student> com = (Student a , Student b )->{ // Labda Expression
        //     if(a.age>b.age)
        //     return 1;
        //     else 
        //     return -1 ;

        Collections.sort(list);
        System.out.println(list);
    
    
        };
        // Collections.sort(list,com );
        // System.out.println(list);

        



        
    }
    

