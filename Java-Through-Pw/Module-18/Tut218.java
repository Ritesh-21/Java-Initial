interface A
 {
    // int age ; // not allowed
    // void show(){ // not allowed
        
        // }

        int age = 41 ; 
 
        void show();
}


public class Tut218 {
    public static void main(String[] args) {

        // System.out.println(age); // not allowed
        // A.age = 43;   // Not allowed 
        // A k = new A();  // not allowed

System.out.println(A.age);
        
    }
    
}
