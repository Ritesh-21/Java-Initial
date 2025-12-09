public class Tut227 {
     
    // TrY and Catch 

    public static void main(String[] args) {

        int num1 = 15; 
        int num2 = 0; // 5
        int res = 0;

        try
       {
          res = num1 / num2;
        
        }

        catch(Exception obj ) 
        {
            System.out.println("Galat matter ho gaye bhaiya.."+obj);
        }

        System.out.println(res);
        System.out.println("Sab khairiyat se ?");
        
    }
    
}
