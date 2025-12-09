
// LAMBDA EXPRESSION Implementation 
interface Car {

    void show(int avg , String st );
}


public class Tut225 {
    
public static void main(String[] args) {

    Car cc = (avg,st) ->  System.out.println("Bhrum Bhrum"+" "+ avg+ " " + st );
    cc.show(100,"SuzukiHayatye");
        
    

    
}

}
