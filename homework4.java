import java.util.*;

class homework4 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	 //4번
	 System.out.print("10이하의 자연수를 입력하시오 : ");
	 int n = sc.nextInt();
	 if (n<=10) {
		for(int i = 1; i<=n; i++) {
			System.out.print("Freeze");
		}
	 }
	 else {
		System.out.println("10이하의 자연수를 입력하시오.");
	  }
  }
}