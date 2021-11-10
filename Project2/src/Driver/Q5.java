package Driver;

public class Q5 {

	public Q5() {}
	
	public static void main(String[] args) {
		
		int idx =4;
		String str = "Hello";
		System.out.println("original String: " +str);
		String sub = SubString(idx,str);
		System.out.println("This is the substring:" +sub+"(substring contained between 0 and "+idx+" -1 inclusive)");
		
	
	}
	static String SubString(int idx, String str) {
		//declare a substring that's length index specific
		char[] subString = new char [idx];
		
		//iterate until index is hit
		for(int i=0;  i<idx-1;i++)
		{
			//iterate through string and assign the character until idx-1 to the substring character array
			subString[i] = str.charAt(i);
		}
		//convert the subString character array to a string
		String subStr = new String(subString);
		//return subString
		return subStr;
		}
}

