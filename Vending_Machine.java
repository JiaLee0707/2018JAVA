import java.util.*;

class Vending_Machine {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	
	int a=0;
	//String name;
	System.out.println("                  Vending_Machine");
	System.out.println("----------------------------------------------------");
	System.out.println("  1.�ݶ�(600) 2.Ŀ��(300) 3.��(500) 4.������(700)");
	System.out.println("----------------------------------------------------");
	System.out.print("  �ݾ��� �Է��ϼ��� : ");
	int money = sc.nextInt();
	while(1>a) {
		System.out.print("  ���Ḧ �����ϼ��� : ");
		//int num = sc.nextInt();
		String name = sc.next();
		System.out.print("  �������? : ");
		int count = sc.nextInt();
		switch(name) {
			case "�ݶ�" : money = money - 600 * count;
			break;
			case "Ŀ��" : money = money - 300 * count;
			break;
			case "��" : money = money - 500 * count;
			break;
			case "������" : money = money - 700 * count;
			break;
		}
		switch(name) {
			case "1" : name = "�ݶ�"; money = money - 600 * count;
			break;
			case "2" : name = "Ŀ��"; money = money - 300 * count;
			break;
			case "3" : name = "��"; money = money - 500 * count;
			break;
			case "4" : name = "������"; money = money - 700 * count;
			break;
			default : name = "�� ����~";
			break;
		}

		if(name.equals("�� ����~")) {
		System.out.println("  ������~");
		System.out.print("  �ٽ� �����Ұž�?(��/��) ");
		String s= sc.next();
			if(s.equals("��")) {
				continue;
			}
			else if(s.equals("��")) {
				a=1;
				return;
			}
		}

		if (money<0) {
		int moneyplus = -(money);
		System.out.print("  �ܾ���" +moneyplus+"�� �����մϴ�. �߰������Ͻðڽ��ϱ�?(��/��) : ");
		String s= sc.next();
			if(s.equals("��")) {
				System.out.print("  �ݾ��� �Է��ϼ��� : ");
				moneyplus = sc.nextInt();
				money += moneyplus;
			}
			else if(s.equals("��")) {
				a=1;
				return;
			}
		}
		int money1000=(money/1000);
		int money500=((money-(money1000*1000))/500);
		int money100=((money-(money1000*1000)-(money500*500))/100);
		int money10=((money-(money1000*1000)-(money500*500)-(money100*100))/10);

		System.out.println("----------------------------------------------------");
		System.out.println("  ������ ����� "+name+" "+count+"���̸� �Ž������� "+money+"���Դϴ�.");
		System.out.println("  1000�� : "+money1000+", 500�� : "+money500+", 100�� : "+money100+", 10�� : "+money10);
		System.out.println("----------------------------------------------------");
		System.out.print("  �߰������Ͻðڽ��ϱ�?(��/��) ");
		String s= sc.next();
		if(s.equals("��")) {
			continue;
		}
		else if(s.equals("��")) {
			a=1;
		}
	}
}
}