import java.util.*;

class soanner_Test3 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);

	System.out.print("���� �Է��Ͻʽÿ� : ");
	int d = sc.nextInt();
	System.out.println(d+"��");
	
	for(int a = 1; a<=9; a++) {
		System.out.println(d+"*"+a+"="+(d*a));
	}
  }
}