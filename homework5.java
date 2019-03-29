import java.util.*;

class homework5 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	  //5번
	  System.out.print("x를 입력하시오 : ");
	  int x = sc.nextInt();
	  System.out.print("y를 입력하시오 : ");
	  int y = sc.nextInt();
	  if(((x&y)<=100)) {
		if(x<=y) {
			for(int i = x; i<=y; i++) {
				System.out.print(i);
			}
		}
		else if(y<=x) {
			for(int i = y; i<=x; i++) {
				System.out.print(i);
			}	
		}
	  }
  }
}