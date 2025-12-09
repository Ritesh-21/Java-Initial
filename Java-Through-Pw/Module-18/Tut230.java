class demo {
public void a() throws Exception
{ 


    // try{
b();
// }
// catch(Exception e){
//     System.out.println("Error"+e);
// }

} 

public void b() throws Exception
{

int num1 = 5;
int num2 = 0; 

// try
// {
int res = num1 / num2 ;
System.out.println(res);
// }

// catch(Exception e){
//     System.out.println("Error"+e.getMessage());
// } 
}
}
public class Tut230 { 

    // Handling Vs Ducking an Exception 

    public static void main(String[] args) {

        demo dd = new demo();
        try
        {
        dd.a(); }
        catch(Exception e){
            System.out.println("Error"+e);
        }

        // System.out.println("Exception handle ho raha hai");
        
    }
    
}
