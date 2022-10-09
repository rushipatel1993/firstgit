public class OddEven001 {

    static int  a = 27, b = 54; // a & b represent number

    public static void main(String[] args){

         String result = a%2==0 ? " Even " : "Odd";
         String result1 = b%2==0 ? " Even"  : "Odd";


         System.out.println( " First number" + " : " + a + " is " + result);
        System.out.println( " Second number" + " : " + b + " is " + result1);


    }
}
