import java.util.*;

class array_Test6 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	//3��
	//������� �Է��� 5�� �޾Ƽ� �ִ� ���
    int max=0;
    int a[]=new int[5];
    for(int i=0; i<a.length; i++){
		System.out.print("������ �Է��Ͻÿ� : ");
		int b=sc.nextInt();
		a[i]=b;
		if (a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("�ִ밪 : "+max);
 }
}