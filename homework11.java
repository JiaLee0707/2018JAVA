import java.util.*;

class homework11 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//11번
		int count = 0;
		int t = 0;
		for(int z = 100; z<=999; z++) {
			if(z%4!=0) {
				count=count+1;
				t=t+z;
			}
		}
		System.out.println("100부터 999까지 4의 배수가 아닌 갯수는 "+count+"입니다.");
		System.out.println("100부터 999까지 4의 배수가 아닌 합은 "+t+"입니다.");
  }
}