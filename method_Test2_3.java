//2. 절대값 구하기
//리턴값 o, 매개변수 o

import java.util.*;
class method_Test2_3 {
	public int a(int x) {
		if(x<0) {
			return -x;
		}
		else {
			return x;
		}
	}
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method_Test2_3 m3=new method_Test2_3();
		System.out.print("숫자를 입력하시오 : ");
		int y=sc.nextInt();
		System.out.println(y+"의 절대값 : "+m3.a(y));
	}
}