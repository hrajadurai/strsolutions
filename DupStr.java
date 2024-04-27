package artifact_01;

public class DupStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1 = "tycoypeo";
		String dup = "";
		dup = strhasdupchar(st1);
		System.out.println("The repeated string is : " + dup);
		
	}
	
	public static String strhasdupchar(String s) {
		System.out.println("Inside strhasdupchar .... ");
		String d = "";
		int len = s.length()-1;
		int i=0;
		for(int j=0;j<=len;j++) {			
		System.out.println("The s is  j : " + s.charAt(j));
			for(i=j+1;i<=len ;i++) {
				System.out.println("The s is  i : " + s.charAt(i));
				if(s.charAt(i) == s.charAt(j)) {
					d += s.charAt(i);
					System.out.println("The s is : " + d);
				}
			}
			
		}
		return d;
	}
	
//	public static String strhasrepstr(String s) {
//		
//		String dStr = "";
//		int ln = s.length()-1;
//		int i=0;
//		for(int j=1;j<=ln;j++) {
//			if(s.charAt(i) == s.charAt(j)) {
//				int k =;
//			}
//		}
//		
//		return dStr;
//	}
	

}
