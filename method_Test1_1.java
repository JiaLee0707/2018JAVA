//1. 어떤값이 짝수인지 홀수인지 판단
//리턴값 x, 매개변수 o

import java.util.*;
class method_Test1_1 {
	public void x(int a) {
		if(a%2==0) {
			System.out.println(a+"는 짝수");
		}
		else {
			System.out.println(a+"는 홀수");
		}
	}
	
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int y=sc.nextInt();
		method_Test1_1 m1=new method_Test1_1();
		m1.x(y);
	}
}