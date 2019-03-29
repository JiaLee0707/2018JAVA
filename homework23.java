import java.util.*;

class homework23 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//23번
		int s = 0;
		int p = 0;
		System.out.print("두 개의 정수를 입력하시오 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a<=b) {
			for(int x = a; x<=b; x++) {
				if(((x%3)==0)|((x%5)==0)) {
					s = s+x;
				}
			}
			p = s/(b-a);
		}
		else if (b<=a) {
			for(int x = b; x<=a; x++) {
				if(((x%3)==0)|((x%5)==0)) {
					s = s+x;
				}
			}
			p = s/(a-b);
		}

		System.out.println(a + "와(과)" +b+"사이에서 3의 배수이거나 5의 배수인 수들의 합은"+s+"이고 평균은"+p+"입니다.");

  }
}