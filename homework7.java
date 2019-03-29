import java.util.*;

class homework7 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	//7번
	for (int a=0; 1>a; ) {
		System.out.print("게임을 종료하시겠습니까? ");
		int c = sc.nextInt ();
		if (c==1) {
			a=1;
		}
		else if (c==0) {
			continue;
		}
		else {
			System.out.println("0(종료) 또는 1(계속)을 입력하십시오.");
		}
	}
  }
} 