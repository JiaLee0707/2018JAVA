import java.util.*;

class homework20 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//20¹ø
		int n=sc.nextInt();
		for(int s=1; s<=n; n--) {
			for(int i=1; i<=n; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
  }
}