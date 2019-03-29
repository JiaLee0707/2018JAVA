import java.util.*;

class Vending_Machine {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	
	int a=0;
	//String name;
	System.out.println("                  Vending_Machine");
	System.out.println("----------------------------------------------------");
	System.out.println("  1.콜라(600) 2.커피(300) 3.물(500) 4.보리차(700)");
	System.out.println("----------------------------------------------------");
	System.out.print("  금액을 입력하세요 : ");
	int money = sc.nextInt();
	while(1>a) {
		System.out.print("  음료를 선택하세요 : ");
		//int num = sc.nextInt();
		String name = sc.next();
		System.out.print("  몇개먹을래? : ");
		int count = sc.nextInt();
		switch(name) {
			case "콜라" : money = money - 600 * count;
			break;
			case "커피" : money = money - 300 * count;
			break;
			case "물" : money = money - 500 * count;
			break;
			case "보리차" : money = money - 700 * count;
			break;
		}
		switch(name) {
			case "1" : name = "콜라"; money = money - 600 * count;
			break;
			case "2" : name = "커피"; money = money - 300 * count;
			break;
			case "3" : name = "물"; money = money - 500 * count;
			break;
			case "4" : name = "보리차"; money = money - 700 * count;
			break;
			default : name = "응 없어~";
			break;
		}

		if(name.equals("응 없어~")) {
		System.out.println("  응없어~");
		System.out.print("  다시 선택할거야?(ㅇ/ㄴ) ");
		String s= sc.next();
			if(s.equals("ㅇ")) {
				continue;
			}
			else if(s.equals("ㄴ")) {
				a=1;
				return;
			}
		}

		if (money<0) {
		int moneyplus = -(money);
		System.out.print("  잔액이" +moneyplus+"원 부족합니다. 추가투입하시겠습니까?(ㅇ/ㄴ) : ");
		String s= sc.next();
			if(s.equals("ㅇ")) {
				System.out.print("  금액을 입력하세요 : ");
				moneyplus = sc.nextInt();
				money += moneyplus;
			}
			else if(s.equals("ㄴ")) {
				a=1;
				return;
			}
		}
		int money1000=(money/1000);
		int money500=((money-(money1000*1000))/500);
		int money100=((money-(money1000*1000)-(money500*500))/100);
		int money10=((money-(money1000*1000)-(money500*500)-(money100*100))/10);

		System.out.println("----------------------------------------------------");
		System.out.println("  뽑으신 음료는 "+name+" "+count+"개이며 거스름돈은 "+money+"원입니다.");
		System.out.println("  1000원 : "+money1000+", 500원 : "+money500+", 100원 : "+money100+", 10원 : "+money10);
		System.out.println("----------------------------------------------------");
		System.out.print("  추가선택하시겠습니까?(ㅇ/ㄴ) ");
		String s= sc.next();
		if(s.equals("ㅇ")) {
			continue;
		}
		else if(s.equals("ㄴ")) {
			a=1;
		}
	}
}
}