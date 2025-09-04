public class Tut34 {

    // RECURSION IN JAVA

    public static void main(String[] args) {
       // int x = 5;
        System.out.println("The value of factorial 5 is "+factorial(4));
    }

    static int  factorial(int n){
        // factorial(n) = n* n-1
        // factorial (5) = 5* 4* 3* 2* 1 = 120

        if(n==0 || n==1){

            return 1;
        }
        else{

            return n* factorial(n-1);
        }
        


    }


    
}
