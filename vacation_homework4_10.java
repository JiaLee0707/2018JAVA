import java.util.*;

class vacation_homework4_10 {
  public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);

	//각 자리의 합을 구하는 코드
	int sum=0;
	System.out.println("각 자리의 합을 구하는 코드");
	System.out.print("변수를 입력하시오 : ");
	int num=sc.nextInt();
	while(!(num%10==0)) {
		sum+=num%10;
		num=num/10;
	}
	System.out.println(sum);
  }
}