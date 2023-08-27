package practice.problems;

public class StringCleanup {
	public static void main(String[] args) {
		String s = "My name is AMIT";
		String result = cleanup(s);
		
		System.out.println("Before: " + s);
		System.out.println("After: " + result);
		

	}
	
	
	
	public static String cleanup(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ) sb.append(s.charAt(i));
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ) {
				char lower = (char) ((char)(s.charAt(i) - 'A') + 'a');
				sb.append(lower);
			}
		}
		
		return sb.toString();
	}
	
	
}
