

enum Res {

    PASS, FAIL, NR;
}

public class Tut8 {

    public static void main(String[] args) {
        Res d = Res.PASS;

        switch (d) {
            case PASS -> System.out.println("pASSED!");

            case FAIL -> System.out.println("FAILD");
            case NR -> System.out.println("Not Resulted");
        }
    }

}
