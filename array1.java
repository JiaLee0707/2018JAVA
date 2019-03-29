import java.util.*;

class array1 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	int a[]=new int[5];
	int j=0,h=0;
	System.out.println("5개의 정수를 입력하시오.");
	for(int i=0; i<a.length; i++) {
		a[i]=sc.nextInt();
		if(a[i]%2==0) {
			j+=a[i];
		}
		else {
			h+=a[i];
		}
	}
	System.out.println("짝수의 합 = "+j);
	System.out.println("홀수의 합 = "+h);
  }
}