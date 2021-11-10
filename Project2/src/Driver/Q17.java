package Driver;

import java.util.ArrayList;
import java.util.Scanner;

public class Q17 
{

	public static void interest() {
		double principal = bankInput("principal");
		double rate = bankInput("rate");
		double years = bankInput("time in years");

		double simpleinterest = principal*rate*years;

		System.out.println("your interst is " + simpleinterest);
	}



	public static double bankInput(String s)
	{
		Scanner input = new Scanner(System.in);
		double ans;
		do
		{
			System.out.println("please enter positve "+s);
			ans = input.nextDouble();
		} while(ans<0);
		return ans;
	}
}