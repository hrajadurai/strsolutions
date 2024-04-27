package artifact_01;

public class PalinStr {
	
	public static void main (String [] args) {
		
	String str = "\"A man, a plan, a canal: panama\"";
	boolean bVal;
	
	bVal = palin(str);
	
	System.out.println("The give palindrom is : " + bVal);
	
	}
	
	public static boolean palin(String str) {
		
		System.out.println("In palin function : ");
		StringBuilder st = new StringBuilder();
		int i=0;
		int len = str.length();
		System.out.println("In lenth of string is " + len);
		for(i=0 ;i<= len-1;i++) {
			
			char c = str.charAt(i);
			System.out.println("Frist c is " + c);
			if(c >= 'A' && c <= 'Z' || c >= 'a'  && c <= 'z') {
				System.out.println("Second c is " + c);
				st.append(c);
			}
		} 
		String vPalin = st.toString();
		System.out.println("Frist string is " + vPalin);
		len = vPalin.length();
		int upLimit = (int) Math.pow(10, 5);

		StringBuilder st1 = new StringBuilder();
		String s ="";
		if(1 <= len && len <= upLimit) {
			for(i=len-1 ;i>=0;i--) {
				char c = vPalin.charAt(i);
				if(c >= 'A' && c <= 'Z' || c >= 'a'  && c <= 'z') {
					st1.append(c);
					s+=c;
				}
			}	
			
		}
		String vPalin1=st1.toString();
		System.out.println("vPalin1 c is " + vPalin1);
		System.out.println("s  is " + s);
		
		if(vPalin.equals(vPalin1)) {
			return true;
		}
		
		return false;
		
	}

	
	
}
