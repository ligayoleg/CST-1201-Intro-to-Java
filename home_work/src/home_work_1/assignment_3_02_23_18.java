package home_work_1;

public class assignment_3_02_23_18 {
	
	public static void main(String[] args) {
		String s1, s2, s3;
		s1 = "welcome";
		s2 = "Welcome";
		boolean isEqual = false;
		boolean isEqualIgnoringCase = false;
		int x1, x2, s1Length;
		boolean b1 = false, b2 = false;
		char s1FirstChar;
		
//		a.
		if(s1.equals(s2)) {
			isEqual = true;
		}
		System.out.println(isEqual);
		
//		b.
		if(s1.equalsIgnoreCase(s2)) {
			isEqualIgnoringCase = true;
		}
		System.out.println(isEqualIgnoringCase);
		
//		c.
		x1 = s1.compareTo(s2);
		System.out.println(x1);
		
//		d.
		x2 = s1.compareToIgnoreCase(s2);
		System.out.println(x2);
		
//		e.
		if(s1.startsWith("AAA")) {
			b1 = true;
		}
		System.out.println(b1);
		
//		f. 
		if(s2.startsWith("AAA")) {
			b2 = true;
		}
		System.out.println(b2);
		
//		g.
		s1Length = s1.length();
		System.out.println("The length of: \"" + s1 + "\" , is " + s1Length);
		
//		h.
		s1FirstChar = s1.charAt(0);
		System.out.println("The first character of: \"" +s1+ " \" is: " + s1FirstChar);
		
//		i.
		s3 = s1.concat(s2);
		System.out.println(s3);
		
//		j.
		System.out.println(s1.substring(1));
		
	}

}
