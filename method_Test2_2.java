//2. 절대값 구하기
//리턴값 o, 매개변수 x
import java.util.*;
class method_Test2_2 {
	Scanner sc=new Scanner(System.in);
	public String a(){
		System.out.print("숫자를 입력하시오 : ");
		int x=sc.nextInt();
		if(x<0) {
			return (x+"의 절대값 : "+ -x);
		}
		else {
			return (x+"의 절대값 : "+ x);
		}
	}

	public static void main(String ar[]) {
		method_Test2_2 m2=new method_Test2_2();
		System.out.println(m2.a());
	}
}