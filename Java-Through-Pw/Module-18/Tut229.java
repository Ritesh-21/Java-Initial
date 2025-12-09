import java.util.InputMismatchException;
import java.util.Scanner;

public class Tut229 {

    // Sc.close(); And Finally{} Block

    public static void main(String[] args) {
        int num = 0;
        
        // Try with Resourcr 
        
        try(Scanner sc = new Scanner (System.in);)
         
        {

        num = sc.nextInt();
        // sc.close();

        }


        catch(InputMismatchException e){

            System.out.println("Enter a Numer");
          //  sc.close();

        }

        // finally{ // chahe exception aye ya naa aaye ye execute hoga hi
        //     sc.close();
        //     System.out.println("Resource closed");
        // }

        System.out.println(num);

        //DRY 

    }
    
}
