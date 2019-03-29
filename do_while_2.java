import java.util.*;

class do_while_2 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	//n을 입력받아 1~n사이에 3의 배수이면서 5의 배수인 수 출력
    int n=sc.nextInt();
    int i=1;
    do{
		if(i%3==0&i%5==0) {
			System.out.println(i);
		}
		i++;
    }while(i<=n);
 }
}