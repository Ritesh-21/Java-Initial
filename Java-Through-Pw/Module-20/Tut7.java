import java.io.*;
public class Tut7 {
    public static void main(String[] args) throws IOException
     {
        // More on File Classes

        // File dir = new File("PWJAVA");
        // // System.out.println(dir.isDirectory());  
        
        // dir.mkdir();
        // System.out.println("dir is refering to the directory "+ dir.isDirectory());

        // File file = new File(dir, "pwskill.txt");
        // file.createNewFile();

        // System.out.println("File is refering to the PWSKILL.TXT"+ file.isFile());

      int  count = 0;
      
      File f = new File("PWJAVA");

      String str[] = f.list();

      for (String name : str) {
        count ++ ;
        System.out.println(name);
        
      }
      System.out.println("No of files are "+count);


    }
    
}
