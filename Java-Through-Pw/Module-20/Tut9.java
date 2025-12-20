import java.io.*;
public class Tut9 {

    public static void main(String[] args) throws Exception
    {
        // Reading data from File To java using File Reader 

        File dir = new File("PW");
        File file = new File(dir,"pw.txxt");

        try (FileReader fr = new FileReader(file)) {
            int i = fr.read();

            //   System.out.println((char)i);

            while(i!=-1){
                System.out.print(i+"------->");
                System.out.println((char)i);
                i = fr.read();
            }
        }


    }
    
}
