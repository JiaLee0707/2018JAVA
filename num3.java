import java.util.*;

class num3 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    System.out.print("단을 입력하시오 : ");
    int n=sc.nextInt();
    int i=1;
	System.out.println(n+"단");
	while(i<=9) {
		System.out.println(n+"*"+i+"="+n*i);
		i++;	
	}
  }
}