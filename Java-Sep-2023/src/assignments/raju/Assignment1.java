package assignments.raju;

public class Assignment1 {

	// 12kfkhf#%$34YW%#$DDGS56(#^(78R9 -> extract numbers from the string and make
	// the sum of digits
	// Exp O/P : 123456789 -> 1+2+3+4+5+6+7+8+9 = 45
	// Ex: 12jh#%23 -> 1223 -> 1+2+2+3 = 8,

	/**
	 * It filters numbers from the given string and make the sum of digits If String
	 * doesn't contain any number, it returns 0 If string length is 0, then it
	 * returns 0
	 * 
	 * @param alphaNumericString
	 * @return
	 */
	public static int filterTheNumberAndMakeTheSum(String alphaNumericString) {

		if (alphaNumericString.length() == 0) {
			return 0;
		} else {
			int result = 0;
			if (alphaNumericString.replaceAll("[^0-9]", "").length() > 0) {
				for (char eachChar : alphaNumericString.replaceAll("[^0-9]", "").toCharArray()) {
					result = result + (eachChar - '0');
				}
			}
			return result;
		}
	}

	public static void main(String[] args) {
		System.out.println(filterTheNumberAndMakeTheSum("12kfkhf#%$34YW%#$DDGS56(#^(78R9"));
		System.out.println(filterTheNumberAndMakeTheSum("12jh#%23"));
	}
}
