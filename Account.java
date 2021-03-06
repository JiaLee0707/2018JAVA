import java.util.*;
class Account{
	private String account_No="12345678";//계좌번호
	private String owner="미림";
	private String passwd="1111";//비밀번호
	private int balance=5000;//잔고
	
	Scanner sc=new Scanner(System.in);
	public int choice_1() { //선택
		String choice=sc.next();
		if(choice.equals("Y") || choice.equals("y")) {
			return 0;
		}
		else {
			System.out.println("------------------------------------");
			System.out.println("미림 은행을 이용해주셔서 감사합니다.");
			return 1;
		}
	}

	private void account() { //계좌번호
		while(true) {
			System.out.print("계좌번호를 입력하시오 : ");
			String number=sc.next();
			if(!(number.equals(account_No))) {
				System.out.println("잘못된 계좌번호입니다.");
				continue;
			}
			break;
		}
	}

	private void passwd_No() { //비밀번호
		while(true) {
			System.out.print("비밀번호를 입력하시오 : ");
			String pw=sc.next();
			if(!(pw.equals(passwd))) {
				System.out.println("잘못된 비밀번호입니다.");
				continue;
			}
			break;
		}
	}

	public void deposit() {  //입금
		Account mirim_1=new Account();
		while(true) {
			System.out.print("얼마를 입금하시겠습니까? ");
			int money=sc.nextInt();
			if(money>0) {
				balance+=money;
				System.out.println(owner+"의 잔고는 "+balance+"원 입니다.");
				System.out.print("추가입금 하시겠습니까?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
			else {
				System.out.print("잘못된 금액입니다. 다시 입력하시겠습니까?(Y/N) ");
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

	public void widthDraw() { //출금
		Account mirim_1=new Account();
		while(true) {
			System.out.print("얼마를 출금하시겠습니까? ");
			int money=sc.nextInt();
			if(money>=0 && (balance-money)>=0) {
				balance-=money;
				System.out.println(owner+"님의 잔고는 "+balance+"원 입니다.");
				System.out.print("추가출금 하시겠습니까?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
			else if(money>=0 && (balance-money)<0) {
				System.out.println("잔고가 부족합니다. 다시 입력하시겠습니까?(Y/N) ");
				int a=mirim_1.choice_1();
				if(a==0) {
					continue;
				}
				else if(a==1) {
					break;
				}
			}
			else {
				System.out.println("잘못된 금액입니다. 다시 입력하시겠습니까?(Y/N) ");
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
		System.out.println("             미림 은행");
		System.out.println("------------------------------------");
		mirim.account();
		//mirim.owner_No();
		mirim.passwd_No();

		System.out.println("현재 잔고는 " + mirim.balance + "입니다."); 
		System.out.print("입금 or 출금 : ");
		String OR=sc.next();
		if(OR.equals("입금")) {
			mirim.deposit();
		}
		else if(OR.equals("출금")) {
			mirim.widthDraw();
		}
	}
}