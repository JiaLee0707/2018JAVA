import java.util.*;

class while_1 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    //n�� �Է¹޾� 1~n���� 4�� ��� ���
    System.out.print("n�� �Է��Ͻÿ� : ");
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