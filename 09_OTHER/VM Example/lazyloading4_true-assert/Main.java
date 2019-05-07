/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/lazyloading4
 * The benchmark was taken from the repo: 24 January 2018
 */
class Problem {
  private static final Object[] DEFAULT = {};
  private Object data;

  Problem() {
    this.data = DEFAULT;
  }

  void checkInvariant() {
    assert data != null;
  }
}

public class Main {
  public static void main(String[] args) {
    new Problem().checkInvariant();
  }
}
