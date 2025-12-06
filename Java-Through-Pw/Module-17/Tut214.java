// class Aeroplane {

//     public void takeoff() {
//         System.out.println("Aeroplane is taking off");

//     }

//     public void fly() {

//         System.out.println("Aeroplane is flying");
//     }
// }

// class Cargoplane extends Aeroplane {

//     public void takeoff() {
//         System.out.println("CargoPlane requires longer runway");

//     }

//     public void fly() {

//         System.out.println("CargoPlane flies at lower height");
//     }

// }

// class Passengerplane extends Aeroplane {
//     public void takeoff() {
//         System.out.println("Passenger plane requires medium size runway");

//     }

//     public void fly() {

//         System.out.println("PassengerPlane flies at meduim height  ");
//     }
// }

// public class Tut214 {
//     public static void main(String[] args) {

//         Passengerplane pp = new Passengerplane();
//         pp.takeoff();
//         pp.fly();

//         Cargoplane cc = new Cargoplane();
//         cc.takeoff();
//         cc.fly();

//         Aeroplane ref;

//         ref = cc;

//         ref.takeoff();
//         ref.fly();

//         System.out.println("--------------------------------");

//         ref = pp;

//         ref.fly();
//         ref.takeoff();

//         // pp = cp;

//     }

// }
