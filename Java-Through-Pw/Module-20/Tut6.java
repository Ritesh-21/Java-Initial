import java.io.*;
public class Tut6 {
    public static void main(String[] args) throws IOException
    {
        // Creating file and Directory using Java File 

        // File file1 = new File("pw.ext");

        // System.out.println(file1.exists()); // FALSE 

        // file1.createNewFile();
        // System.out.println(file1.exists()); // TRUE 

        File dir = new File("PW");
        System.out.println(dir.exists()); // false 

        dir.mkdir();
        System.out.println(dir.exists()); // true 


    }
    
}
