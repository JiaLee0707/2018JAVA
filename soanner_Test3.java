import java.util.*;

class soanner_Test3 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);

	System.out.print("단을 입력하십시오 : ");
	int d = sc.nextInt();
	System.out.println(d+"단");
	
	for(int a = 1; a<=9; a++) {
		System.out.println(d+"*"+a+"="+(d*a));
	}
  }
}