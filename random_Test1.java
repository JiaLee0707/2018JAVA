import java.util.*;

class random_Test1 {
 public static void main(String ar[]) {
  Scanner sc=new Scanner(System.in);
   Random r=new Random();

   int no=r.nextInt(100);
   System.out.println("�� 10���� ��ȸ�� �ֽ��ϴ�.");
   System.out.println("1~100������ ���ڸ� ���纸����.");

   int conut=1;
   do {
		System.out.print(conut+"��° : ");
		int me = sc.nextInt();
		if(me==no) {
			System.out.println("�����Դϴ�.");
			break;
		}
		else if(me<no) {
			System.out.println("�� �����ϴ�.");
		}
		else if(me>no) {
			System.out.println("�� �۽��ϴ�.");
		}
		conut++;
   }while (conut<=10);
   if(conut>10) {
	   System.out.println("");
	   System.out.println("�����Դϴ�.");
   }
 }
}