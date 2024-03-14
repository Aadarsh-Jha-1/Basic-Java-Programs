//Print all the numbers between x to y
package loops;
import java.util.Scanner;
public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Initial Number : ");
		int x = sc.nextInt();
		System.out.println("Enter Final Number : ");
		int y = sc.nextInt();
		for(x+=1;x<y;x++)// x is already initialised in line 8.
		{
			System.out.println(x);
		}
		
	}
	
}
