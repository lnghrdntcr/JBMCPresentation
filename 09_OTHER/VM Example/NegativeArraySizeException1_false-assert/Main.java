/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/NegativeArraySizeException1
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {
  public static void main(String[] args) {
      try {
          int a[]=new int[-1];
      }
      catch (NegativeArraySizeException exc) {
          assert false;
      }
  }
}
