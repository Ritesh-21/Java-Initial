
class Tut16 {

    // Try and catch 

    
    public static void main(String[] args) {
        int a = 6;
        int b = 2;
        int result = 0;
        int values []= {4,7,2,9};
    
        try{
            
            result = a/b;
            System.out.println(values[5]);
        }
    
        catch(ArithmeticException e){
    
            System.out.println("Something went wrong "+e );
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(values.length-1);
            System.out.println("stay in your limits");
        }
        System.out.println(result);
        System.out.println("Bye");

    }
}
