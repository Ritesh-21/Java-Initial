// abstract class Aeroplane {

//   abstract  public void takeoff();

//   abstract  public void fly();

// }

// class Cargoplane extends Aeroplane {

//     public void takeoff() {
//         System.out.println("CargoPlane requires longer runway");

//     }

//     public void fly() {

//         System.out.println("CargoPlane flies at lower height");
//     }

// }

// class Passengerplane {
// public void takeoff(){
//     System.out.println("Passenger plane requires medium size runway");
// }
// public void fly(){
//     System.out.println("Passengerplane flies at medium height");
// }

// }
// public class Tut216 {
//     public static void main(String[] args) {

//         Aeroplane pp = new PassengerPlane();
//         pp.takeoff();
//         pp.fly();

//         Aeroplane cp = new Cargoplane();
//         cp.takeoff();
//         cp.fly();
         


//     }
    
// }




/*Constructor	❌ Nahi hota	✅ hota hai isko explain karna jara bhai jab abstract class puri hai hi nahi to uska onject nahi ban sakta aur jab obj nahi ban sakta to constructor kaise banega 
 * Bhai wah 🔥 — ye ek top-level conceptual sawaal hai,
aur tu bilkul sahi soch raha hai 👏



Chalo ekdum step-by-step aur real example ke saath samjhte hain:
“Abstract class me constructor hota kaise hai jab uska object banta hi nahi?”



🧩 Step 1: Pehla point — haan, abstract class ka object nahi banta

Bilkul sahi ✅

abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}


Ab agar tu likhe:

Animal a = new Animal(); // ❌ Error — Cannot instantiate abstract class


To ye error dega — kyunki abstract class incomplete hoti hai (isme kuch abstract methods ho sakte hain jinhe define nahi kiya gaya hota).



🧠 Step 2: To phir constructor ka kaam kya hai abstract class me?



👉 Constructor abstract class me isliye hota hai,
kyunki jab koi child class usko extend karti hai,
to child class ke object banne ke time pe parent (abstract) class ka constructor bhi call hota hai.

Object child class ka banta hai,
par uske andar parent class ke part bhi hote hain (inherited variables/methods).
Unko initialize karne ke liye abstract class ka constructor call hota hai.


⚙️ Step 3: Example dekh le 👇


abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    abstract void sound();
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}

🧾 Output:
Animal constructor called
Dog constructor called



🧩 Step 4: Yahaan kya hua?



Tu Dog d = new Dog(); likhta hai.

JVM sabse pehle parent (Animal) ka constructor call karti hai.

Uske baad child (Dog) ka constructor call hota hai.

Even though Animal abstract hai (aur uska object nahi bana),
lekin uska constructor call hota hai to initialize Animal ke members
jo Dog ne inherit kiye hain.



🔍 Step 5: Ek aur visualization soch



Soch ek template class (abstract) hai — uske andar kuch base setup likha hai.

Example:

abstract class Vehicle {
    int speed;
    Vehicle() {
        speed = 0;
        System.out.println("Vehicle constructor: speed set to 0");
    }
}
class Car extends Vehicle {
    Car() {
        System.out.println("Car constructor: ready to drive");
    }
}
class Test {
    public static void main(String[] args) {
        new Car();
    }
}


Output:

Vehicle constructor: speed set to 0
Car constructor: ready to drive


Dekha bhai?
Vehicle abstract hai, lekin uska constructor call hua —
kyunki Car ke object ke andar Vehicle ka part bhi exist karta hai.



⚡ Step 6: Summary Table



Concept	Explanation
Abstract class	Incomplete class jisme kuch abstract (unimplemented) methods ho sakte hain
Object	❌ Nahi ban sakta directly
Constructor	✅ Hota hai — taaki child class ke object banne ke time parent ka setup ho sake
Kyon zaruri hai	Parent (abstract) class ke variables initialize karne ke liye
Call order	Parent constructor → Child constructor
💡 Ek line me samajh lo:

“Abstract class ka object nahi banta,
par jab uski child class ka object banta hai,
to us abstract class ka constructor automatically call hota hai
— taaki uske inherited members initialize ho jaayein.
 */