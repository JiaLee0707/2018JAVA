import java.util.*;

class array_Test6 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	//3번
	//사용자의 입력을 5개 받아서 최댓값 출력
    int max=0;
    int a[]=new int[5];
    for(int i=0; i<a.length; i++){
		System.out.print("정수를 입력하시오 : ");
		int b=sc.nextInt();
		a[i]=b;
		if (a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("최대값 : "+max);
 }
}