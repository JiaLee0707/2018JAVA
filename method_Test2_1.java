//2. 절대값 구하기
//리턴값 x, 매개변수 o

import java.util.*;
class method_Test2_1 {
	public void a(int x) {
		if(x<0) {
			System.out.println(x+"의 절대값 : "+-x);
		}
		else {
			System.out.println(x+"의 절대값 : "+x);
		}
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int y=sc.nextInt();
		method_Test2_1 m1=new method_Test2_1();
		m1.a(y);
	}
}