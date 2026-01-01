
enum Resultt {

    PASS, FAIL , NR;
    // public static void final Resultt PASS = new Resultt()
    // public static void final Resultt Fail = new Resultt()
    // public static void final Resultt NR = new Resultt()

      int marks;
    Resultt() {

        System.out.println("Cnstructor in Enum");
    }

    void setMarks(int marks){
        this.marks=marks;
    }
    int getMarks(){

        return marks;
    }

    
}
public class Tut7 { 


    public static void main(String[] args) {
        // More on Enum 

        Resultt.FAIL.setMarks(31);
      int dd=  Resultt.FAIL.getMarks();
      System.out.println(dd);//31

      Resultt.PASS.setMarks(21);
      int dd2 = Resultt.PASS.getMarks();
      System.out.println(dd2);//21

      int d3 = Resultt.NR.getMarks();
      System.out.println(d3);//0

        
    }
    
}
