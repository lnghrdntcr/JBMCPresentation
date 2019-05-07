/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/virtual_function_unwinding
 * The benchmark was taken from the repo: 24 January 2018
 */
interface Interface {
  boolean b();
}

class Inner implements Interface {
  public boolean b() { return false; }
}

class Outer implements Interface {
  private Interface inner;
  public Outer(Interface inner) { this.inner = inner; }
  public boolean b() { return !inner.b(); }
}

public class Main {
  public static void main(String[] args) {
    assert new Outer(new Inner()).b();
  }
}
