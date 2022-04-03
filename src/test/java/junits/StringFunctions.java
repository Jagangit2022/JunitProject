package junits;

public class StringFunctions {
	
/*
	public static boolean isPalindrom(String str) {
		
		for(int i=0; i< str.length()-1;i++) {
			for(int j=str.length()-1;j>0;j--) {
				if(str.charAt(i) != str.charAt(j)) {
					return false;
				}else {
					continue;
				}
			}
		}
		return true;
	
	}
*/	

	public static boolean isPalindrom(String str) {
		//String str ="madam";
		
		int start = 0;
		int end = str.length()-1;
		
		while(start<end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
