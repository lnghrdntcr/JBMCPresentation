/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/package1
 * The benchmark was taken from the repo: 24 January 2018
 */
import mypackage.*;

class Main
{
  public static void main(String[] args)
  {
    int result=classB.some_method();
    assert result==123;
  }
};
