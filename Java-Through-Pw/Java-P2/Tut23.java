
// import java.util.ArrayList;
// import java.util.Iterator;
// import java.util.ListIterator;

// public class Tut23 {

//     public static void main(String[] args) {
//         // iterator return karega ek iterator
// Iterator values ko access karne ke liye ya fetch karne ke liye use hota hai 
// collection mai kuch classes index based accessing allow nahi karti hai isliye loops ka use nahi kar sakte 
// value fetch karne ke liye thats why we use Iterator
//         ArrayList arr = new ArrayList();

//         arr.add(20);
//         arr.add(30);
//         arr.add(50);
//         arr.add(70);
//         arr.add(100);

//         System.out.println(arr);

//         // for (int i = 0; i < arr.size(); i++) {

//         // //    Object ob = arr.get(i);
//         // //    System.out.println(ob);

//         // System.out.println(arr.get(i));
            
//         // }


//         // for (Object ob : arr) {
//         //     System.out.println(ob);
            
//         // }

//         Iterator ai = arr.iterator();

//         while(ai.hasNext()){
//             System.out.println(ai.next());

//         }

//         ListIterator lr = arr.listIterator(arr.size());

//         while (lr.hasPrevious()) {
//             System.out.println(lr.previous());
            
//         }
//     }
    
// }
