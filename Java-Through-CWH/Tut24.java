public class Tut24 {

    public static void main(String[] args) {

        // Break and Continue using Loops !

        // Implementation of BREAK using FOR loop

        // for (int i = 0; i <= 5; i++) {
        // System.out.println(i);
        // System.out.println("Java is Great");

        // if (i == 2) {
        // System.out.println("Ending the loop ");
        // break;
        // }
        // }
        // System.out.println("Khatam ho gaya bhaiya matter");

        // Implementation of BREAK through WHILE LOOP !

        // int i = 0;
        // while (i <= 5) {

        // System.out.println(i);
        // System.out.println("Java is Great");
        // if (i == 2) {
        // System.out.println("Ending the loop ");
        // break;
        // }
        // i++;
        // }
        // System.out.println("Khatam ho gaya bhaiya matter");

        // Implementation of BREAK through DO-WHILE loop !

        // int i = 0;
        // do{
        // System.out.println(i);
        // System.out.println("Java is Great");

        // if (i == 2) {
        // System.out.println("Ending the loop ");
        // break;
        // }
        // i++;
        // }
        // while (i <= 5);

        // System.out.println("Khatam ho gaya bhaiya matter");

        // BREAK means , BREAK the loop at the current itration

        // Implementation of CONTINUE through Loops !

        // for(int i = 0;i<=5;i++)
        // {
        // if (i == 2) // iska matlab jab control CONTINUE par jaega to uske neeche
        // jo bhi likha hai usko chodo aur next iteration par jao
        // current wali ko SKIP karo ( keval 2 ko chodke baki print honge)
        // jese hi continue aata hai CONTROL ko next iteration par le jata hai
        // {
        // System.out.println("Ending the loop ");
        // continue;
        // }
        // System.out.println(i);
        // System.out.println("Java is Great");

        // }
        // System.out.println("Khatam ho gaya bhaiya matter");

        int i = 0;
        do {

            i++;
            if (i == 2) {
                System.out.println("Ending the loop ");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is Great");
        } while (i < 5);

        System.out.println("Khatam ho gaya bhaiya matter");

        // Break statement completely exit the loop
        // Continue Statement skips the particular iteration of the loop

    }

}
