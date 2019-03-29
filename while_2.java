import java.util.*;

class while_2 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	
	//n,m을 입력받아 n~m까지 짝수합, 홀수합(두개 비교까지)
	int n=sc.nextInt();
	int m=sc.nextInt();
	int even=0;
	int odd=0;
	int i;
	if(n<=m) {
		i=n;
		while(i<=m) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
			i++;
		}
	}
	else if(m<=n) {
		i=m;
		while(i<=n) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
			i++;
		}
	}
	System.out.println(n+"~"+m+"까지 짝수의 합은 "+even+"입니다.");
	System.out.println(n+"~"+m+"까지 홀수의 합은 "+odd+"입니다.");
  }
}