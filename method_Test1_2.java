//1. 어떤값이 짝수인지 홀수인지 판단
//리턴값 o, 매개변수 x

import java.util.*;
class method_Test1_2 {
	Scanner sc=new Scanner(System.in);
	public String x() {
		System.out.print("숫자를 입력하시오 : ");
		int a=sc.nextInt();
		if(a%2==0) {
			return(a+"는 짝수");
		}
		else {
			return(a+"는 홀수");
		}
	}

	public static void main(String ar[]) {
		method_Test1_2 m2=new method_Test1_2();
		System.out.println(m2.x());
	}
}