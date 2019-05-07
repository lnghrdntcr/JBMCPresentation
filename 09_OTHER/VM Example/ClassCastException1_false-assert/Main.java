/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/ClassCastException1
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {
  public static void main(String[] args) {
      try {
          Object x = new Integer(0);
          String y = (String)x;
      }
      catch (ClassCastException exc) {
          assert false;
      }
    
  }
}
