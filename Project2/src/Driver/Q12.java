package Driver;

public class Q12 {

	public static void main(String[] args) {
		
		int arraySize = 100;
		int[] myArray = new int [arraySize];
		//populate original array w/numbers 1 to 100
		for (int i=0; i< myArray.length; i++) {
			myArray[i]= i+1; //we add 1 to store 1 - 100
		}
			//iterate through array and find even numbers using for each loop
			for (int even : myArray) {
				// if value is divisible by 2 it's even
				if(even % 2 == 0)
				{
					System.out.println("Even: " +even);
				}
			}	
				}
				//print array sequence
				static void printArray(int myArray[]){
				{
					int n = 0;
					for (int i=0; i<n; ++i) {
						System.out.println(myArray[i] +" ");
					}
					System.out.println();
				}
			}
		}
