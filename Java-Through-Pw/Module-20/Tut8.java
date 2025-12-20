import java.io.*;
public class Tut8 { 
    public static void main(String[] args) throws IOException
     {
        // Writing data onto files using FileWriter

        File dir = new File("PW");

        File file = new File(dir,"pw.txxt");

        try ( // file.createNewFile();
        // System.out.println(file.exists());
                FileWriter fw = new FileWriter(file , true)) {
            fw.write("Rinkujirika");
            fw.write("\n");
            fw.write(81);
            fw.write("\n");
            fw.write("Shikichikuariri");
            fw.write("\n");
            fw.write(21);
            fw.write("\n");
            fw.write('R');
            fw.write("\n");
            char ch []={'a','h','g','e','m'};
            fw.write("\n");
            fw.write(ch);
            fw.write("\n");
        }

        // fw.flush();

        System.out.println("Open Pw.txxt file to see result");




        
    }
    
}
