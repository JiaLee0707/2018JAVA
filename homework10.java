import java.util.*;

class homework10 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
     //10번
		int count = 0;
		int t = 0;
		for(int x = 100; x<=999; x++) {
			if (x%7==0) {
				count=count+1;
				t=t+x;
			}
		}
		System.out.println("100부터 999까지 7의 배수의 갯수는 "+count+"입니다.");
		System.out.println("100부터 999까지 7의 배수의 합은 "+t+"입니다.");
	}
}