import java.util.*;

class homework18 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//18¹ø
		for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				if(a+b==14) {
					System.out.println(a+" "+b);
				}
			}
		}
  }
}