import java.util.*;

class homework4 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	 //4��
	 System.out.print("10������ �ڿ����� �Է��Ͻÿ� : ");
	 int n = sc.nextInt();
	 if (n<=10) {
		for(int i = 1; i<=n; i++) {
			System.out.print("Freeze");
		}
	 }
	 else {
		System.out.println("10������ �ڿ����� �Է��Ͻÿ�.");
	  }
  }
}