import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Tut12 {
    public static void main(String[] args) throws Exception

    {
        //  Buffered Reader and File-Reader 

        File dir = new File("PWJAVA");
        File file = new File( dir , "pwskill.txt");

        FileReader fr = new FileReader(file);

        try (BufferedReader bw = new BufferedReader(fr)) {
            String line =bw.readLine();

            //  System.out.println(link);

            while(line != null){
                System.out.println(line);

               line= bw.readLine(); // For line Updation 


            }
        }


        

    }
    
}
