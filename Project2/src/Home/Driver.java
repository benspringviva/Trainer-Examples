package Home;

import Driver.Q1;

import Driver.Q2;

import Driver.Q3;

import Driver.Q4;

import Driver.Q5;

import Driver.Q6;

import Driver.Q7;

import Driver.Q8;
import Driver.Q13;
import Driver.Q14;
import Driver.Q15;
import Driver.Q16;
import Driver.Q17;

public class Driver {

	public static void main(String [] args) {
		//Q1 question1 = new Q1();
			//Q1.BubbleSort();
			
		Q2 question2 = new Q2();
		int count=26;
		System.out.println("Fibonacci Series of "+count+" numbers:");
		question2.fibonacci(count);
		System.out.println();

		Q3 question3 = new Q3();
		Q3.TestReverse();

		Q4 question4 = new Q4();
		Q4.main(null);

		Q5 question5 = new Q5();


		Q6 question6 = new Q6();
		int number1 = 217;
		String even =question6.isEven(number1);
		System.out.println(number1 +" is "+ even);
		
		Q7 q7 = new Q7();
		q7.Comparator();
		
		Q8 q8 = new Q8();
		q8.Palindrome();
		
		Q13 question13 = new Q13();
		Q13.PrintTriangle(4);
		Q14 question14 = new Q14();
		Q14.SwitchCases(1);
		Q14.SwitchCases(2);
		Q14.SwitchCases(3);
		Q15 q15 = new Q15();
		q15.Interfaces();

		if (args.length  > 0)
			System.out.println(args[0].length());



		Q17 question17 = new Q17();
		Q17.interest();
	}
}
