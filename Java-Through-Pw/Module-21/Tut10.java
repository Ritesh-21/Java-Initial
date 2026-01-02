
// import java.lang.annotation.Annotation;
// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;

// @Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
// @Retention(RetentionPolicy.RUNTIME)
// @interface CricketPlayer {

//     String country() default "India";

//     int age() default 21;

// }

// @CricketPlayer
// class Virat {

//     @CricketPlayer
//     private int inning;
//     private int runs;

//     @CricketPlayer
//     public void setInning(int inning) {
//         this.inning = inning;
//     }

//     public int getInning() {
//         return inning;
//     }

//     public void setRuns(int runs) {

//         this.runs = runs;

//     }

//     public int getRuns() {
//         return runs;
//     }

// }

// public class Tut10 {

//     public static void main(String[] args) {

//         Virat vv = new Virat();

//         vv.setInning(300);
//         vv.setRuns(10000);

//         System.out.println(vv.getInning());
//         System.out.println(vv.getRuns());

//         Class cp = vv.getClass();

//      Annotation a = cp.getAnnotation(CricketPlayer.class);
//      CricketPlayer cpp = (CricketPlayer)a;

//      String st =cpp.country();
//      System.out.println(st);

//      int age =cpp.age();
//      System.out.println(age);

//     }

// }

// Notes 
// custom aanotation banane ke liye aapko interface ke aaage @ lagana padega Aur fif target batana padta hai ki aap kahan use kar rahe ho Element.Type se batate hain kahn kahn use karna hai....@RetentionPolicy se aap batate ho ki iska yani annotation ka power kahan tak hai matlab RunTime ya Compile time tak ..... Accha Annotation banaya to uske ander aap bata sakte ho ki wo annotation kya accept karega ..Exanple String country() deafult "India"; values aap yahn bhi de sakte ho and jab inko call ya use karoge tab bhi de sakte ho
// Application API ka use karke aap Annotation ke ander ki values ko jaan skate ho 
