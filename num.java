import java.util.*;

class num {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    int n = sc.nextInt();
    for(int i=1; i<=n; i++) {
		for(int j=1; j<=i; j++) {
			System.out.print(j);
		}
		System.out.println("");
    }
  }
}