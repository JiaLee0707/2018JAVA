import java.util.*;
class star_Test {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);

	int x=sc.nextInt();
	for(int i=1; i<=x; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println("");
	}
  }
}