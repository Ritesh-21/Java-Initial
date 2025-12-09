public class Tut231 {

    // Rethrowing an exception (Throws, throw , finally) and Custom Exception 

    public static void main(String[] args) {

        int num1 = 15 ;
        int num2 = -5;
        
        try{
            if(num2<0){

                Exception e = new ArithmeticException();
                throw e ;


// System.out.println("Enter a Valid Num");




            }
        
      else { int res = num1 / num2 ;
        System.out.println(res);
        }
        }
        catch(Exception e){
            System.out.println("Enter a Valid num " +e);
        }
    }
    
}
