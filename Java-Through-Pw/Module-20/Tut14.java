// import java.io.BufferedOutputStream;
// import java.io.FileOutputStream;
// import java.io.ObjectOutput;
// import java.io.ObjectOutputStream;
// import java.io.Serializable;

// class Cricketer implements Serializable {

//     private String name;
//     private int run;
//     private int age;

//     public Cricketer(int run, String name, int age) {
//         this.name = name;
//         this.run = run;
//         this.age = age;

//     }

//     public void disp(){

//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(run);
//     }
// }

// public class Tut14 {
//     public static void main(String[] args) throws Exception
//      {

//         Cricketer c = new Cricketer(5000, "V.Kohli", 34);

//         FileOutputStream fos = new FileOutputStream("pw.ext");
//         BufferedOutputStream bos = new BufferedOutputStream(fos);
//         ObjectOutputStream oos = new ObjectOutputStream(bos);

//         oos.writeObject(c);
//         oos.flush();
//         oos.close();



//     }

// }
