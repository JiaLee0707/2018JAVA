import java.util.*;

class homework11 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//11��
		int count = 0;
		int t = 0;
		for(int z = 100; z<=999; z++) {
			if(z%4!=0) {
				count=count+1;
				t=t+z;
			}
		}
		System.out.println("100���� 999���� 4�� ����� �ƴ� ������ "+count+"�Դϴ�.");
		System.out.println("100���� 999���� 4�� ����� �ƴ� ���� "+t+"�Դϴ�.");
  }
}