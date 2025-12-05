class student {

    private int age;
    private String name;

    student() {

        System.out.println("Default Constructor is called");
        name = "Dholu ";
        age = 22;

    }

    student(String name) {
        this.name = name;
        age = 33;

    }

    student(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void display() {

        System.out.print(name);
        System.out.println(age);
    }

}

public class ConstOverload {

    public static void main(String[] args) {

        student ok = new student();
        ok.display();

        student ok1 = new student("Taaya ");
        ok1.display();

        student ok2 = new student("Chacha ",56);
        ok2.display();


    }

}
