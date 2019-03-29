//3. 양수인지 음수인지 판단
//리턴값 o, 매개변수 o

import java.util.*;
class method_Test3_3 {
	public String a(int x) {
		if(x>0) {
			return "양수";
		}
		else {
			return "음수";
		}
	}

	public static void main(String ar[]) {
		method_Test3_3 m3=new method_Test3_3();
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int y=sc.nextInt();
		System.out.println(y+"은 "+m3.a(y));
	}
}