import java.util.*;

class homework13 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
     	//13��
		for(int n=1; n<=100; n++) {
			if(n%7==0|n%11==0) {
				System.out.println(n);
			}
		}
  }
}