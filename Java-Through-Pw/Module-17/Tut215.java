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

// class Fighterplane extends Aeroplane {

//     public void takeoff() {
//         System.out.println("Fighterplane requires small size runway");
//     }

//     public void fly() {
//         System.out.println("Fighterplane flies at high height");
//     }

// }

// class Airport {
//     public void poly(Aeroplane ref) {

//         ref.takeoff();
//         ref.fly();
//         System.out.println("---------------------------");
//     }

// }

// public class Tut215 {
//     public static void main(String[] args) {

//         Cargoplane cc = new Cargoplane();
//         Passengerplane pp = new Passengerplane();
//         Fighterplane ff = new Fighterplane();

//         Airport ap = new Airport();
//         ap.poly(cc);
//         ap.poly(pp);
//         ap.poly(ff);

        // cc.takeoff();
        // cc.fly();

        // ff.takeoff();
        // ff.fly();

        // pp.fly();
        // pp.takeoff();

//     }

// }
/*Bahut accha sawaal bhai 👏
Tu ye poochh raha hai ki Airport class ke andar jo poly() method hai —
wo ref.takeoff() aur ref.fly() ko kaise call kar paa rahi hai,
jabki Airport class ne Aeroplane ko extend bhi nahi kiya?

Chalo step by step samajhte hain 👇

🧠 Step 1: poly(Aeroplane ref) ka matlab kya hai
public void poly(Aeroplane ref)


iska matlab hai —
poly() method Aeroplane type ka reference leta hai as argument.

Ab Aeroplane ek parent (base) class hai,
aur Java me inheritance ke wajah se:

Child class ka object Parent class ke reference variable me store ho sakta hai.

⚙️ Step 2: Polymorphism (Dynamic Method Dispatch)

Jab tu ye line chalata hai:

ap.poly(cc);


to yahaan cc ek Cargoplane ka object hai,
lekin poly() method ke parameter me vo Aeroplane type ke reference (ref) ke through jaata hai.

To internally ye hota hai:

Aeroplane ref = cc; // (Cargoplane object assigned to Aeroplane reference)


Ab jab ref.takeoff() aur ref.fly() call hoti hain,
Java runtime pe check karta hai kis class ka actual object hai (Cargoplane),
aur wahi method call karta hai (child class wali).

👉 Yehi hota hai Runtime Polymorphism ya Dynamic Method Dispatch.

🧩 Step 3: Airport class ko inherit karne ki zarurat kyu nahi

Airport class me bas ye likha hai:

ref.takeoff();
ref.fly();


Aur ye dono methods Aeroplane class me defined hain (aur child classes me overridden hain).

To Airport class ko Aeroplane se extend karne ki koi zarurat nahi hai,
kyunki wo khud Aeroplane ke object ke reference ke through methods call kar rahi hai —
uske paas object ka control already hai!

✈️ Simple Example

Soch jaise:

Aeroplane = base design

Cargoplane, Passengerplane, Fighterplane = different versions of plane

Airport = system jo plane ko handle karta hai (but khud plane nahi hai)

Airport sirf bolta hai:

“Plane, tu takeoff kar aur fly kar!”

Usko fark nahi padta plane ka type kya hai — bas Aeroplane class ka object hona chahiye.

💬 Summary

✅ Airport class me inheritance nahi hai,
lekin wo Aeroplane ke reference ke through child objects ke methods call kar sakti hai.

✅ poly() method me polymorphism use ho raha hai.

✅ Java runtime pe decide karta hai kaunsi class ka method chalega (Cargoplane, Passengerplane, Fighterplane). */