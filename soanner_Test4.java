import java.util.*;

class soanner_Test4 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	System.out.print("n�� �Է��Ͻÿ� : ");
	int n = sc.nextInt();
	for(int i=n; i>=1; i--) {
		for(int j=n; j>=i; j--) {
			System.out.print(j);
		}
		System.out.println("");
	}
  }
}