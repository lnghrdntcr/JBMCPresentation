public class Regex {

	public static String recRemove(String entry, String mask){
	
		int count = 1;

		while(count > 0){
		
			String prev = entry;
			entry = entry.replace(mask, "");

			count = prev.length() - entry.length();

		}

		return entry;

	}

	public static String _filter(String entry){
	
		entry = recRemove(entry, " or ");
/*		entry = recRemove(entry, " and ");
		entry = recRemove(entry, " && ");
*/		entry = recRemove(entry, " || ");
/*		entry = recRemove(entry, "=");
		entry = recRemove(entry, "union");
*/
		return entry;
	
	}


	public static String filter(String s){
		
		String cur = s;
		String prev = "";
		do {
			prev = cur;
			cur = _filter(s);
		} while(!(prev.equals(cur)));

		return cur;

	}


	public static void main(String args[]){
	
		if(args.length < 1 || args[0] == null)
			return;

		assert !(filter(args[0]).contains(" or "));		
/*		assert !(filter(args[0]).contains(" and "));		
*/		assert !(filter(args[0]).contains(" || "));		
/*		assert !(filter(args[0]).contains(" && "));		
		assert !(filter(args[0]).contains("="));		
		assert !(filter(args[0]).contains("union"));		
*/	
	}

}
