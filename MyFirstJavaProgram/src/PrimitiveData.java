
public class PrimitiveData {
 public static void main (String args []) {
	 String num1 = "10";
	 String num2 = "20";
	 
	 System.out.println(num1+num2);
	 
	 int x = Integer.parseInt(num1);
	 int y = Integer.parseInt(num2);
	 
	  System.out.println("x + y is equal to " + (x+y));
	  
	  String num3 = "34.55";
	  double d1 = Double.parseDouble(num3);
	  
	  // int z = Integer.parseInt(num3);
	  /* Number format Exception */
	  System.out.println(d1);
	  
	  //System.out.println(z);
 	}
 
 
 
}