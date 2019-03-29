import java.util.*;

class num4 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int i=1;
    int sum=0;
    while(i<=n) {
		if(i%2==0) {
			sum=sum+i;
		}
		i++;
    }
    System.out.println("1부터"+n+"까지 짝수의 합 = "+ sum);
  }
}