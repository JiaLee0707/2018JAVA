import java.util.*;

class array_Test5 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	//2��
	//Ű����κ��� 10���� ������ �Է¹޾� �迭�� �����ϰ�
	//�� �߿��� 3�� ����� ���� ��� ���
    int i[];
    i=new int[10];

    for(int x=0; x<i.length; x++) {
		int y=sc.nextInt();
		i[x]=y;
		if(y%3==0) {
			System.out.println(i[x]);
		}
    }
	
 }
}