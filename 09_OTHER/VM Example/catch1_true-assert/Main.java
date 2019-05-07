/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/catch1
 * The benchmark was taken from the repo: 24 January 2018
 */
class some_exception1 extends Throwable
{
};

class some_exception2 extends some_exception1
{
};

class Main
{
  public static void main(String[] args)
  {
    try
    {
      throw new some_exception2();
    }
    
    catch(some_exception1 e)
    {
        assert e instanceof some_exception2;
        if (e instanceof some_exception2)
            return;
    }
    assert false;
  }
}

