/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/ArithmeticException5
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {
    public static void  main(String args[]) {
        try {
            double i=0;
            double j=10/i;
        }
        catch(ArithmeticException exc) {
            assert false;
        }
    }
}
