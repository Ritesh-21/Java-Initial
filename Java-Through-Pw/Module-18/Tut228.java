public class Tut228 {

    // TrY with Multiple Catch Block
    public static void main(String[] args) {

       // int num1 = 15;
       // int num2 = 5;
        int res = 0;
        int vales[] = { 2, 4, 6, 8 };
       // String name = null ;

        try {

          //  res = num1 / name.length();
            // res = num1 / num2;
            System.out.println(vales[4]);
        } catch (ArithmeticException e) {

            System.out.println("Something went Galat ho gaya" + e);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(vales[vales.length-1]);
            System.out.println("Bhen te bhand Otat main" + e);

        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(res);
        System.out.println(" kya haal chaal ?");
    }

}
