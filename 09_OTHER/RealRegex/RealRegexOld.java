import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RealRegex{

	public static void main(String args[]){
	
		if(args.length < 1 || args[0] == null)
			return;
		
		if(args[0].length() > 10) return;
	
/*		Pattern exp = Pattern.compile("<\\w+.*?>");

		String s = args[0];

		Matcher m = exp.matcher(s);
*/

		String s1 = args[0].replace("a", "");
		// String s1 = args[0].replaceAll("<\\w+.*?>", "");
		if(s1 == null) return;
		assert !(s1.equals("aaa"));

	}

}
