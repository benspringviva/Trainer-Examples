package Driver;

public class Q10 {

	public static void main(String[] args) {
		int bake = 4;
		int baker = 5;
		
		System.out.println("It's less to bake  "+bake+" cookies and more fun to bake"    +baker+" cookies:");
		int minBak = (bake < baker) ? bake : baker;
		
		System.out.println(minBak); 
		
	}
}
