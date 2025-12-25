import java.io.*;
public class Tut10 {
    public static void main(String[] args) throws IOException
     {
        // More on File Reader 

        File dir = new File("PW");
        File file = new File(dir , "pw.txxt");

        try (FileReader fw = new FileReader(file)) {
            char ch [] = new char[(int)file.length()];

            // int i = fw.read();

            fw.read(ch);
            for (char data : ch) {
                System.out.print(data);
                
            }
        }


        
    }
    
}
