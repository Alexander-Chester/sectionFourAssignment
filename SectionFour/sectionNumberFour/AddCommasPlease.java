package sectionNumberFour;

public class AddCommasPlease {
	
	private String formatNumberString(String digits) {
		
		String FormatedDigits = "";
		int digitLen = digits.length();
		int numDigits = 0;
		
		//iterating from length down to zero allows the conditional that follows to function
		for(int i = digitLen-1; i>=0; i--) {
			FormatedDigits += digits.charAt(i);
			numDigits ++;
			if(((numDigits % 3) == 0) && (i>0)) {
				FormatedDigits = ","+ FormatedDigits;
			}
		}
		return FormatedDigits;
	}
}
