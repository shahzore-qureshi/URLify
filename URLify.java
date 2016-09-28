public class URLify {

	public static void main(String[] args) {

		if(args.length != 2) {
			System.out.println("Please include one String argument and its integer length as a second argument.");
			return;
		}	

		String inputString = args[0];
		int maxLength;

		try {
			maxLength = Integer.parseInt(args[1]);
		} catch (Exception e) {
			System.out.println("Please enter a proper integer length for the String.");
			return;
		}

		char[] charArray = inputString.toCharArray();
		String newString = "";
		for(int i = 0; i < maxLength; i++) {
			if(charArray[i] == ' ') {
				newString += "%20";	
			} else {
				newString += charArray[i] + "";
			}
		}

		System.out.println("Original String: \"" + inputString + "\"");
		System.out.println("URLified String: \"" + newString + "\"");

	}

}
