//4. 두 수 사이의 합구기
//리턴값 o, 매개변수 x

import java.util.*;
class method_Test4_2 {
	public String a() {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("두 수 사이의 합을 구할 숫자 2개를 입력하시오 : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		for(int i=x+1; i<y; i++) {
			sum+=i;
		}
		return (x+"와 "+y+" 두 수 사이의 합 : "+sum);
	}

	public static void main(String ar[]) {
		method_Test4_2 m2=new method_Test4_2();
		System.out.println(m2.a());
	}
}