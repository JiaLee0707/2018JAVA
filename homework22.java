import java.util.*;

class homework22 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	    //22��
		int a = 0;
		int j = 0;
		int h = 0;
		while (a<1)
		{
			for(int c = 1; c<=10; c++) {
				System.out.println("������ �Է��Ͻÿ� : ");
				int n = sc.nextInt() ;
				if(n%2==0) {
					j+=1;
				}
				if(n%2!=0) {
					h+=1;
				}
			}
			a=1;
		}
		System.out.println("¦���� ������"+ j +"�Դϴ�.");
		System.out.println("Ȧ���� ������"+ h +"�Դϴ�.");	
  }
}