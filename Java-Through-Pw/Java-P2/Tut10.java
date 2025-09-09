// class Aeroplane {

//     public void takeoff(){
//         System.out.println("Aeroplane is takeoff");
//     }

//     public void fly(){
//         System.out.println("Aeroplane is flying");
//     }
// }

// class CargoPlane extends Aeroplane {

//     public void takeoff(){
//         System.out.println("Cargo plane requires longer runway");
//     }

//     public void fly(){
//         System.out.println("Cargo plane flies at lower height");
//     }


// }

// class PassengerPlane  extends Aeroplane {


//     public void takeoff(){
//         System.out.println("pp requires medium size runway");
//     }

//     public void fly(){
//         System.out.println("pp flies at medium height");
//     }
// }
// public class Tut10 {

//     // Types of Inheritance 

//     // 1 single level , 2 multilevel , 3 hirechical 

//     public static void main(String[] args) {

//         // types of method (inherited , overrinding , specialized )

//         // Introduction to Polymorphism

//         CargoPlane cc = new CargoPlane();
//         // cc.takeoff();
//         // cc.fly();

//         Aeroplane rr;

//         rr=cc;
//         rr.fly();
//         rr.takeoff();


//         System.out.println("__________________");

        


//         PassengerPlane pp = new PassengerPlane();
//         // pp.takeoff();
//         // pp.fly();/

//         rr=pp;
//         rr.fly();
//         rr.takeoff();


        
//     }
    
// }
