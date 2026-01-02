// parent class
// @FunctionalInterface
// interface demo{
//     void disp();
//     // void disp2();
// }

class Plane {
    public  void PlanefliesAtgoodheight(){

        System.out.println("Plane is flying ");
    }


}
// Sub class 
class CargoPlane extends Plane
{
// Overriden method from parent class
@Override
    public void PlanefliesAtgoodheight(){
        System.out.println("CargoPlane flies at low");
    }
}



public class Tut9 {  
    public static void main(String[] args) {
        // child class object 

        CargoPlane pp = new CargoPlane();
        pp.PlanefliesAtgoodheight();
        
    }
    
}
