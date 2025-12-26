import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Tut13 {
    public static void main(String[] args) throws Exception
    { 

         // Write Operation with Print-Writer

         File dir = new File("PWJAVA");
         File file = new File(dir , "pw.ext");

         FileWriter fw = new FileWriter(file);
         PrintWriter pw = new PrintWriter(fw);

         

         pw.write(97);
         pw.write("\n");

         pw.println("RCB");
         pw.println("Virat Kholi");
         pw.println(263);
         pw.println(15.7);
         pw.println(true);
         pw.close();


        
    }
    
}
