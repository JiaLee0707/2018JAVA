import java.util.*;

class array_Test7 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	//4번
    //사용자의 입력을 5개 받아서 최솟값, 최댓값 출력
    int max=0;
    int min=0;
    int a[]=new int[5];
	System.out.print("정수 5개를 입력하시오 : ");
    for(int i=0; i<a.length; i++) {
		int b=sc.nextInt();
		a[i]=b;
		max=a[0];
		min=a[0];
		if(max>a[i]) {
			max=a[i];
		}
		if(min<a[i]) {
			min=a[i];
		}
	}
	System.out.println("최솟값 : "+min);
	System.out.println("최댓값 : "+max);
 }
}