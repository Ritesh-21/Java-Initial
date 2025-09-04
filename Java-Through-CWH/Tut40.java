
// Getter and Setter ... Access Modifiers

class Myemployee{
private int id; // This can by Access by Method 
private String name;

public String getname(){
    
    return name;

}

public void setname(String n){

    name = n ;
}

public void setid(int i){
    id = i;
}
public int getid(){
    return id;
}





}

public class Tut40 {
    public static void main(String[] args) {

Myemployee rr = new Myemployee();

// rr.id = 45; // Throws an error due to PRIVATE Accessifier
// rr.name = " Rohit ";
rr.setname("Gian");
System.out.println(rr.getname());

rr.setid(45);
System.out.println(rr.getid());
        
    }

    
    
}
