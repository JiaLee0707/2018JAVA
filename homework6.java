import java.util.*;

class homework6 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	 //6��
	System.out.print("������ �Է��Ͻÿ� : ");
	int z = sc.nextInt();
	int t = 0;
	for(int n = 1; n<=z; n++) {
		if(n%5==0) {
			 t = t + n;
	        }
	}
	
	System.out.println("1����" + z + "������ 5�� ����� ����" + t + "�Դϴ�.");
  }
}