
public class StringDemo {
	public static void main(String[] args) {
		String str = "BCAS";
		String str1 = "BCAS CAMPUS JAFFNA";
		String str2 = "BCAS";
		String str3 = "qwerty";
		String str4 = "         hai";
		char charArray[] = {'a', 'e', 'i','o','u'};
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.substring(2));
		System.out.println(str1.charAt(7));
		System.out.println(str.compareTo(str2));
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.concat(str1));
		System.out.println(str.concat(str2));
		System.out.println(str1.concat(str1));
		System.out.println(str2.contentEquals(str2));
		System.out.println(str.contentEquals(str2));
		System.out.println(str.endsWith(str));
		System.out.println(str.endsWith(str1));
		System.out.println(str.copyValueOf(charArray));
		System.out.println(str.endsWith(str2));
		System.out.println(str.endsWith(str1));
		System.out.println(str.equals(str));
		System.out.println(str1.equals(str));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.equalsIgnoreCase(str));
		System.out.println(str.getBytes());
		System.out.println(str2.getBytes());
		//System.out.println(str2.getBytes(charArray));
		//System.out.println(str.getChars(arg0, arg1, arg2, arg3););
		System.out.println(str.hashCode());//2032691
		System.out.println(str.indexOf(0));
		System.out.println(str.indexOf(str2));
		System.out.println(str.indexOf(1, 4));
		System.out.println(str.intern());
		System.out.println(str1.intern());
		System.out.println(str.lastIndexOf(0));
		System.out.println(str.lastIndexOf(str1));
		System.out.println(str.lastIndexOf(str2));
		System.out.println(str.lastIndexOf(0, 0));
		System.out.println(str.lastIndexOf(str2, 0));
		System.out.println(str.length());
		System.out.println(str.matches(str));
		System.out.println(str.matches(str1));
		System.out.println(str.regionMatches(0, str, 0, 0));
		System.out.println(str.regionMatches(0, str1, 0, 0));
		//System.out.println(str.replace(arg0, arg1));
		System.out.println(str.split(str1));
		System.out.println(str.split(str));
		System.out.println(str.startsWith(str1));
		System.out.println(str.startsWith(str));
		System.out.println(str.subSequence(0, 0));
		System.out.println(str1.subSequence(0, 3));
		System.out.println(str.substring(0, 1));
		System.out.println(str1.subSequence(0, 9));
		System.out.println(str.toCharArray());
		System.out.println(str1.toCharArray());
		System.out.println(str.toLowerCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str.toString());
		System.out.println(str1.toString());
		System.out.println(str3.toUpperCase());
		//System.out.println(str3.toUpperCase(arg0));
		System.out.println(str4.trim());
		//System.out.println(str.valueOf());
		
		
		
	}
	
	
	

}
