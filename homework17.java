import java.util.*;

class homework17 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
     	//17��
		System.out.println("������\n");
		for(int i=2; i<=9; i++) {
			System.out.println(i+"��");
				for(int j=1; j<=9; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
				System.out.println("----------------------------------");
		}
  }
}