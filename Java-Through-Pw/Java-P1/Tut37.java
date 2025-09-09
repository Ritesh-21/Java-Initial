
// import java.io.BufferedInputStream;
// import java.io.BufferedOutputStream;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.ObjectInputStream;
// import java.io.Serializable;
// import java.io.ObjectOutputStream;

// class Cricketer implements Serializable {
// // <-----------------Deserialization--------------------->   
//     private String name;
//     private int age;
//     private int runs;

//     Cricketer(String name , int age , int runs){

//         this.name=name;
//         this.age=age;
//         this.runs=runs;
//     }

//     void disp(){

//         System.out.println(name);
//         System.out.println(age);
//         System.out.println(runs);


//     }
// }


// public class Tut37 {
 
//     public static void main(String[] args) throws Exception {

//         // Cricketer cc = new Cricketer("Sachin",21,10000);
//         // cc.disp();

//         // FileOutputStream fos = new FileOutputStream("pw.tt");
//         // BufferedOutputStream bos = new BufferedOutputStream(fos);

//         // ObjectOutputStream oos = new  ObjectOutputStream(bos);

//         // oos.writeObject(cc);
//         // oos.flush();
//         // oos.close();

//         FileInputStream fis = new FileInputStream("pw.tt");
//         BufferedInputStream bis = new BufferedInputStream(fis); // Optional hai effective use ke liye 
//         ObjectInputStream ois = new ObjectInputStream(bis);

//        Cricketer cr =(Cricketer) ois.readObject();
//        cr.disp();


//     }
// }
    

