//가위바위보게임입니다. 가위,바위,보 중에서 입력하세요
//string 비교는 if(c.equals(y){    }
import java.util.*;

class rock_paper_sissors {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	int a=0;
	while(1>a){
		System.out.println("가위바위보!!");
		System.out.print("철수 : ");
		String c=sc.next();
		System.out.print("영희 : ");
		String o=sc.next();

		if(c.equals("가위")) {
			switch (o){
				case "가위" : System.out.println("비겼습니다;;");
				break;
				case "바위" : System.out.println("영희 승!!");
				break;
				case "보" : System.out.println("철수 승!!");
				break;
				default : System.out.println("철수 승!!");
				break;
			}
		}
		else if(c.equals("바위")) {
			switch (o){
				case "가위" : System.out.println("철수 승!!");
				break;
				case "바위" : System.out.println("비겼습니다;;");
				break;
				case "보" : System.out.println("영희 승!!");		
				break;
				default : System.out.println("철수 승!!");
				break;
			}
		}
		else if(c.equals("보")) {
			switch (o){
				case "가위" : System.out.println("영희 승!!");
				break;
				case "바위" : System.out.println("철수 승!!");
				break;
				case "보" : System.out.println("비겼습니다;;");
				break;
				default : System.out.println("철수 승!!");
				break;
			}
		}
		else {
			switch (o){
				case "가위" : 
				case "바위" :
				case "보" : System.out.println("영희 승!!");
				break;
				default : System.out.println("비겼습니다;;");
				break;
			}
		}
		System.out.print("게임을 종료하시겠습니까? 0(계속)/1(종료) : ");
		int x = sc.nextInt ();
		if (x==1) {
			a=1;
		}
		else if (x==0) {
			continue;
		}
		else {
			System.out.println("0(계속) 또는 1(종료)을 입력하십시오.");
		}
	}
  }
}