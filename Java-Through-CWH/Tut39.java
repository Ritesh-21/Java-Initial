// class Employee {

// Bsic Question on OOP

//     int salary;
//     String name;

//     public int getsalary() {

//         return salary;
//     }

//     public String getnamne() {

//         return name;
//     }

//     public void setname(String n) {

//         name = n;

//     }

// }

// class cellphone {
// String ring;
//     public String phonering(){
//         return ring;
//     }
// }

// class cellphone{
// public void ring(){

//     System.out.println("Ringing...");
// }
// public void vibrate(){

//     System.out.println("Vibrating...");
// }
// public void call(){

//     System.out.println("Calling... Maheshh");
// }

// }

class square {

    int side;

    public int area() {

        return side * side;
    }

    public int perimeter() {

        return 4 * side;
    }

}

public class Tut39 {

    public static void main(String[] args) {

        // Employee Jethalal = new Employee();

        // cellphone nokia = new cellphone();
        // nokia.ring= "tillilii";
        // System.out.println(nokia.phonering());

        // nokia.call();
        // nokia.ring();
        // nokia.vibrate();

        // Jethalal.setname("Tappu");
        // Jethalal.salary=1000000;

        // System.out.println(Jethalal.getnamne());
        // System.out.println(Jethalal.getsalary() );

        square sq = new square();
        sq.side = 5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }

}
