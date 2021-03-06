/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringValueOf10
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;

      Object objectRef = args[0]; // assign string to an Object reference
      String tmp=String.valueOf(objectRef);
      assert tmp.equals(args[0] + "s");
   }
}
