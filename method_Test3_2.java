//3. 양수인지 음수인지 판단
//리턴값 o, 매개변수 x

import java.util.*;
class method_Test3_2 {
	public String a() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int x=sc.nextInt();
		if(x>0) {
			return(x+"은 양수");
		}
		else {
			return(x+"은 음수");
		}
	}

	public static void main(String ar[]) {
		method_Test3_2 m2=new method_Test3_2();
		System.out.println(m2.a());
	}
}