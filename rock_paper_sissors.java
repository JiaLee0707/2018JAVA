//���������������Դϴ�. ����,����,�� �߿��� �Է��ϼ���
//string �񱳴� if(c.equals(y){    }
import java.util.*;

class rock_paper_sissors {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	int a=0;
	while(1>a){
		System.out.println("����������!!");
		System.out.print("ö�� : ");
		String c=sc.next();
		System.out.print("���� : ");
		String o=sc.next();

		if(c.equals("����")) {
			switch (o){
				case "����" : System.out.println("�����ϴ�;;");
				break;
				case "����" : System.out.println("���� ��!!");
				break;
				case "��" : System.out.println("ö�� ��!!");
				break;
				default : System.out.println("ö�� ��!!");
				break;
			}
		}
		else if(c.equals("����")) {
			switch (o){
				case "����" : System.out.println("ö�� ��!!");
				break;
				case "����" : System.out.println("�����ϴ�;;");
				break;
				case "��" : System.out.println("���� ��!!");		
				break;
				default : System.out.println("ö�� ��!!");
				break;
			}
		}
		else if(c.equals("��")) {
			switch (o){
				case "����" : System.out.println("���� ��!!");
				break;
				case "����" : System.out.println("ö�� ��!!");
				break;
				case "��" : System.out.println("�����ϴ�;;");
				break;
				default : System.out.println("ö�� ��!!");
				break;
			}
		}
		else {
			switch (o){
				case "����" : 
				case "����" :
				case "��" : System.out.println("���� ��!!");
				break;
				default : System.out.println("�����ϴ�;;");
				break;
			}
		}
		System.out.print("������ �����Ͻðڽ��ϱ�? 0(���)/1(����) : ");
		int x = sc.nextInt ();
		if (x==1) {
			a=1;
		}
		else if (x==0) {
			continue;
		}
		else {
			System.out.println("0(���) �Ǵ� 1(����)�� �Է��Ͻʽÿ�.");
		}
	}
  }
}