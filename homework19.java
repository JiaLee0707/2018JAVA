import java.util.*;

class homework19 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	    //19��
		for(int n=1; n<=100; n++) {
			if(((n%3)==0)&((n%5)!=0)&((n%9)!=0)) {
					System.out.println(n);
			}
		}
  }
}