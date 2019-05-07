/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/synchronized
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main {
  public static void main(String[] args) {
    final Object o = null;
    try {
      synchronized (o) {}
      assert false;
    } catch (NullPointerException e) {
      return;
    }
  }
}
