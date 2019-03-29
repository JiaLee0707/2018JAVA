//1. 어떤값이 짝수인지 홀수인지 판단
//리턴값 o, 매개변수 o

import java.util.*;
class method_Test1_3 {
	public String a(int x) {
		if(x%2==0) {
			return("짝수");
		}
		else {
			return("홀수");
		}
	}
		
	public static void main(String ar[]) {
	Scanner sc=new Scanner(System.in);
		method_Test1_3 m3=new method_Test1_3();
		System.out.print("숫자를 입력하시오 : ");
		int z=sc.nextInt();
		System.out.println(z+"은 "+m3.a(z));
	}
}