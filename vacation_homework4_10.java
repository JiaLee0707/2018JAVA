import java.util.*;

class vacation_homework4_10 {
  public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);

	//�� �ڸ��� ���� ���ϴ� �ڵ�
	int sum=0;
	System.out.println("�� �ڸ��� ���� ���ϴ� �ڵ�");
	System.out.print("������ �Է��Ͻÿ� : ");
	int num=sc.nextInt();
	while(!(num%10==0)) {
		sum+=num%10;
		num=num/10;
	}
	System.out.println(sum);
  }
}