//3. 양수인지 음수인지 판단
//리턴값 x, 매개변수 x

import java.util.*;
class method_Test3 {
	Scanner sc=new Scanner(System.in);
	public void a() {
		System.out.print("숫자를 입력하시오 : ");
		int x=sc.nextInt();
		if(x>0) {
			System.out.println(x+"은 양수");
		}
		else {
			System.out.println(x+"은 음수");
		}
	}
	
	public static void main(String ar[]) {
		method_Test3 m=new method_Test3();
		m.a();
	}
}