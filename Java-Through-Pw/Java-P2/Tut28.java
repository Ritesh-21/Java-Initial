
// import com.sun.tools.attach.AgentInitializationException;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;

// class Student{

//     String name;
//     int age;
//     int marks;

//     public Student(String name , int marks , int age){

//         this.name=name;
//         this.age=age;
//         this.marks=marks;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getAge() {
//         return age;
//     }

//     public int getMarks() {
//         return marks;
//     }

//     public String toString(){

//         return "marks "+marks+" Age "+age+" -"+name;
//     }

    
// }

// class Alpha implements Comparator<Student>{

//     public int compare(Student a, Student b){
//         if (a.age>b.age) 
//             return 1;
//             else
//             return -1;
            
        
//     }



// }
// public class Tut28 {
    

//     public static void main(String[] args) {

//         Student st1 = new Student("Rohit",75,45);
//         Student st2 = new Student("Virat",100,28);
//         Student st3 = new Student("MSD",50,07);

//         // System.out.println(st1.getAge());

//         ArrayList<Student> ar = new ArrayList<Student>();

//         ar.add(st1);
//         ar.add(st2);
//         ar.add(st3);

//         // System.out.println(ar);

//         // Collections.sort(arr);

//         Alpha ap = new Alpha();

//         Collections.sort(ar, ap);
//         System.out.println(ar);


      
        
//     }
// }
