// abstract class Computer {
//     public abstract void compileCode();
// }
interface Computer {
     void compileCode();
}


class laptop implements Computer{

    public void compileCode(){
        System.out.println("You got five Error ");
    }
}
class Desktop implements Computer{

    public void compileCode(){
        System.out.println("You got five Error, faster ");
    }
}
class Developer {
    // laptop obj = new laptop();
    public void buildApp(Computer obj){
        System.out.println("Building App ");
        // laptop obj = new laptop();
        obj.compileCode();
    }
}

public record Tut220() {

public static void main(String[] args) {
    // laptop obj = new laptop();
    Computer obj = new Desktop();
    Developer dev = new Developer();
    dev.buildApp(obj);

}
    
}
