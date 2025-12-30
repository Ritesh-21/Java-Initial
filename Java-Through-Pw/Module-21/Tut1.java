// import java.util.Date; // Traditional way
// import java.util.ArrayList;

// import java.util.Date;

import java.sql.Date;

public class Tut1 {

    public static void main(String[] args) {

        //Introduction to Time and Date ApI in JaVa

        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long MinIns=dt.getTime();

        java.sql.Date dt1 = new Date(MinIns);

        System.out.println(dt1);
        
    }
    
}
