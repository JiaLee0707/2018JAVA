import java.util.*;

class homework10 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
     //10��
		int count = 0;
		int t = 0;
		for(int x = 100; x<=999; x++) {
			if (x%7==0) {
				count=count+1;
				t=t+x;
			}
		}
		System.out.println("100���� 999���� 7�� ����� ������ "+count+"�Դϴ�.");
		System.out.println("100���� 999���� 7�� ����� ���� "+t+"�Դϴ�.");
	}
}