package Driver;

public class Q3 {

	public static String Reverse(String str) {
		char[] charArray = str.toCharArray();
		char[] subArray = new char [charArray.length];
		
		for (int i = charArray.length -1; i >=0; --i) {
				subArray[charArray.length -1 -i] = charArray[i];
		}
		return new String(subArray);
		}
	public static String testString = "My String Test";
	public static void TestReverse() {
		System.out.println(Reverse(testString));
	}
	}

