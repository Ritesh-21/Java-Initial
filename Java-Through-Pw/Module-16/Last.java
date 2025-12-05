
public class Last {

    static int age;

    static{
        System.out.println("Static Block");
        age = 17;
    }

static void display(){
System.out.println("Dislay static method");
System.out.println(age);

}
    public static void main(String[] args) {
        System.out.println("Main Method ");
        display();
    }
}
