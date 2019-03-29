import java.util.*;

class NYPC1 {
  public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
      
	int N, x;
	N = sc.nextInt();
	if(N>=1 && N<=1000) {
		for(int count=1; count<=N; count++) {
			x = sc.nextInt();
			if(x>=65 && x<=90) {
				x=(String)x;
				System.out.println(x);
			}
		}
	}
  }
}