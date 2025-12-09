interface Car{

    void drive();
}

// class Wagnor implements Car{

//     public void drive(){
//         System.out.println("Driving..");


//     }
// }
public class Tut224 {
    public static void main(String[] args) {
        // Car obj = new Wagnor();
        Car obj = () -> {
            System.out.println("Bhroom Bhroom");
        } //  ANONYMOUS CLASS
        ;
        obj.drive();
        
    }
}
