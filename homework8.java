import java.util.*;

class homework8 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//8번
		int p = 0;
		int t = 0;
		int a = 0;
		while (a<1)
		{
			System.out.println("100이하의 정수를 입력하시오 : ");
			int n = sc.nextInt ();
		
			if(n<=100) {
				for (int i = 0; i<n; i++) {
					System.out.println("평균을 구하기 위한 정수를 입력하십시오.");
					int x = sc.nextInt ();
					t = t+x;
					}
				p = t/n;
				System.out.println("n개의 정수의 평균은 "+p+"입니다.");
				return;
			}
		}
  }
}