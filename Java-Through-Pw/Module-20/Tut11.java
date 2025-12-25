import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Tut11 {

    public static void main(String[] args) throws Exception
    {
        // Buffered Writer and File Writer 

    File dir = new File("PWJAVA");

    File file  = new File(dir , "pwskill.txt");

    FileWriter fw = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(fw);

    bw.write("Cricket");
    bw.newLine();
    bw.write(17);
    bw.newLine();
    bw.write("Virat Kohli");
    bw.newLine();
    char ch[] = {'R','C','B'};
    bw.write(ch);
    bw.close();

        
    }

    
    


    
}
