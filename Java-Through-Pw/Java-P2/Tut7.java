// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;
// // import java.text.Annotation;
// import java.lang.annotation.Annotation; 


// @Target({ElementType.TYPE , ElementType.METHOD , ElementType.FIELD}) // batana padega annotation kahan laga rahe ho
// // class pe vaiable pe method pe
// @Retention(RetentionPolicy.RUNTIME) // annotation ka power kahan tak hai compile time tak ya runtime tak
// @interface CricketPlayer{

//     String country() default "India";
//     int age() default 34;


// }


// @CricketPlayer //(iske ander argument bhi de sakte hain)
// class virat{

// @CricketPlayer

// private int innings ;
// private int runs;



//       @CricketPlayer
//     public int getInnings() {
//         return innings;
//     }

//     public void setInnings(int innings) {
//         this.innings = innings;
//     }

//     public int getRuns() {
//         return runs;
//     }

//     public void setRuns(int runs) {
//         this.runs = runs;
//     }



// }
// public class Tut7 {

//     // Custom Annotation and Retrieving value using Reflection API

//     public static void main(String[] args) {

//         virat v = new virat();
//         v.setInnings(324);
//         v.setRuns(100000);

//         // System.out.println("Innings"+v.getInnings()+":"+"Runs"+v.getRuns());

//         Class c =v.getClass();
//        Annotation a= c.getAnnotation(CricketPlayer.class);

//      CricketPlayer cp = (CricketPlayer)a;

//      String country =cp.country();
//      System.out.println(country);


//     int age = cp.age();

//     System.out.println(age);
     
        
//     }
    
// }
