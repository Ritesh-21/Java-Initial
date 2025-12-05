import java.util.Scanner;

class farmer {

    int pa;
    float td;
    static float ri;
    float si;

    void input() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Please enter the amount required");
            pa = sc.nextInt();

            System.out.println("Please Enter the time duration");
            td = sc.nextInt();
        }
         ri = 4.5f;
    }


    void compute(){
si=(pa*td*ri)/100f;

    }
    void display(){
        System.out.println("SI is :"+si);
    }

}

public class Loan {

    public static void main(String[] args) {

        farmer mk = new farmer();
        mk.input();
        mk.compute();
        mk.display();


    }

}
