import java.util.*;

class homework5 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	  //5��
	  System.out.print("x�� �Է��Ͻÿ� : ");
	  int x = sc.nextInt();
	  System.out.print("y�� �Է��Ͻÿ� : ");
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