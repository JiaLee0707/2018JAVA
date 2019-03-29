import java.util.*;

class vacation_homework1 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	//일의 자리를 1로 바꾸는 코드
	System.out.println("일의 자리를 1로 바꾸는 코드\n변수를 입력하시오.");
	int n=sc.nextInt();

	n = (n/10)*10+1;
	System.out.println(n);

	/*int m = n
	while (n<10)
	{
		n = n/10
		n
	}
	*/
  }
}