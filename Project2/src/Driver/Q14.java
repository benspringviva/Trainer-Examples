package Driver;

import java.time.LocalDate;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Q14 {

		public static void SwitchCases(int option) {
			int dNumber = 169;
					switch (option) {
					case 1: 
						System.out.println("Squareroot of " + dNumber + " is " + Math.sqrt(dNumber));
						break;
						
					case 2: 
						System.out.println("Hey the Date Today is " + LocalDate.now());
						break;
						
					case 3:
						String whole = "I'm learning Core Java";
						
						String[] parts = whole.split(" ");
						//next line of code divides phrase above into each individual word  as a stand alone
						for (String s : parts)
							System.out.println(s);
					break;
					}
					
		}
		}
	

