import java.util.*;
class Account{
	private String account_No="12345678";//���¹�ȣ
	private String owner="�̸�";
	private String passwd="1111";//��й�ȣ
	private int balance=5000;//�ܰ�
	
	Scanner sc=new Scanner(System.in);
	public int choice_1() { //����
		String choice=sc.next();
		if(choice.equals("Y") || choice.equals("y")) {
			return 0;
		}
		else {
			System.out.println("------------------------------------");
			System.out.println("�̸� ������ �̿����ּż� �����մϴ�.");
			return 1;
		}
	}

	private void account() { //���¹�ȣ
		while(true) {
			System.out.print("���¹�ȣ�� �Է��Ͻÿ� : ");
			String number=sc.next();
			if(!(number.equals(account_No))) {
				System.out.println("�߸��� ���¹�ȣ�Դϴ�.");
				continue;
			}
			break;
		}
	}

	private void passwd_No() { //��й�ȣ
		while(true) {
			System.out.print("��й�ȣ�� �Է��Ͻÿ� : ");
			String pw=sc.next();
			if(!(pw.equals(passwd))) {
				System.out.println("�߸��� ��й�ȣ�Դϴ�.");
				continue;
			}
			break;
		}
	}

	public void deposit() {  //�Ա�
		Account mirim_1=new Account();
		while(true) {
			System.out.print("�󸶸� �Ա��Ͻðڽ��ϱ�? ");
			int money=sc.nextInt();
			if(money>0) {
				balance+=money;
				System.out.println(owner+"�� �ܰ��� "+balance+"�� �Դϴ�.");
				System.out.print("�߰��Ա� �Ͻðڽ��ϱ�?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
			else {
				System.out.print("�߸��� �ݾ��Դϴ�. �ٽ� �Է��Ͻðڽ��ϱ�?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
		}
	}

	public void widthDraw() { //���
		Account mirim_1=new Account();
		while(true) {
			System.out.print("�󸶸� ����Ͻðڽ��ϱ�? ");
			int money=sc.nextInt();
			if(money>=0 && (balance-money)>=0) {
				balance-=money;
				System.out.println(owner+"���� �ܰ��� "+balance+"�� �Դϴ�.");
				System.out.print("�߰���� �Ͻðڽ��ϱ�?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
			else if(money>=0 && (balance-money)<0) {
				System.out.println("�ܰ��� �����մϴ�. �ٽ� �Է��Ͻðڽ��ϱ�?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
			else {
				System.out.println("�߸��� �ݾ��Դϴ�. �ٽ� �Է��Ͻðڽ��ϱ�?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
		}
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Account mirim=new Account();
		System.out.println("             �̸� ����");
		System.out.println("------------------------------------");
		mirim.account();
		//mirim.owner_No();
		mirim.passwd_No();

		System.out.println("���� �ܰ��� " + mirim.balance + "�Դϴ�."); 
		System.out.print("�Ա� or ��� : ");
		String OR=sc.next();
		if(OR.equals("�Ա�")) {
			mirim.deposit();
		}
		else if(OR.equals("���")) {
			mirim.widthDraw();
		}
	}
}