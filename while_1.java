import java.util.*;

class while_1 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    //n을 입력받아 1~n까지 4의 배수 출력
    System.out.print("n을 입력하시오 : ");
    int n=sc.nextInt();
    int i=1;
    while(i<=n) {
	if(i%4==0) {
		System.out.println(i);
	}
	i++;
    }
 }
}