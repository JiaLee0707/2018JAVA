//4. 두 수 사이의 합구기
//리턴값 o, 매개변수 o

import java.util.*;
class method_Test4_3 {
	public String a(int z, int q) {
		int sum=0;
		for(int i=z+1; i<q; i++) {
			sum+=i;
		}
		return(z+"와 "+q+" 두 수 사이의 합 : "+sum);
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		method_Test4_3 m3=new method_Test4_3();
		System.out.print("두 수 사이의 합을 구할 숫자 2개를 입력하시오 : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(m3.a(x, y));
	}
}