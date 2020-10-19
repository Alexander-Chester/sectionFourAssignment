package sectionNumberFour;
//delets ch from string by dividing string into substrings and concatenating before and after
// instances of ch
public class TwoDeleteChar {
	private String removeAllOccurrences(String str, char ch) {
		while (true) {int pos = str.indexOf(ch);
			if (pos >= 0) {str = str.substring(0, pos)+ str.substring(pos + 1);
			}
				else break;
			}
		return str;
		}

}
