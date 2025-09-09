enum Result{

    PASS,FAIL,NR;

    int marks ;

    Result(){
        System.out.println("Enum construtor called");
    }

    public void setMarks(int marks){

        this.marks=marks;

    }
    public int getMarks(){
        return  marks;
    }


}

public class Tut6 {

    public static void main(String[] args) {

        Result.PASS.setMarks(92);
        int mm =Result.PASS.getMarks();
        System.out.println(mm);
        
        // More on Enum
    }
    
}
