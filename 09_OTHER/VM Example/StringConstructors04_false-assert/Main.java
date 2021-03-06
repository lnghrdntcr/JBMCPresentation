/*
 * Origin of the benchmark:
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/jbmc-strings/StringConstructors04
 * The benchmark was taken from the repo: 24 January 2018
 */
public class Main
{
   public static void main(String[] args)
   {
      if(args.length < 1 || args[0] == null)
        return;

      char[] charArray = {'d', 'i', 'f', 'f', 'b', 'l', 'u', 'e'};
      String s4 = new String(charArray, 4, 4);
      assert s4.equals(args[0]);
   } 
}

