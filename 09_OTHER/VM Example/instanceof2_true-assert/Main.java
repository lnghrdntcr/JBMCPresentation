/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/instanceof2
 * The benchmark was taken from the repo: 24 January 2018
 */
class Main
{
  public static void main(String[] args)
  {
    assert int.class instanceof Object;
  }
};
