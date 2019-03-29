import java.util.*;

class homework9 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
		//9¹ø
		int a = 1;
		int c = 0;

		for(a = 1; a<=100; a++) {
			if(a%4==0) {	
				System.out.print(a+" ");
				c=c+1;
			}
			if(c==8) {
				System.out.println("\n");
				c=0;
			}
		}
  }
}