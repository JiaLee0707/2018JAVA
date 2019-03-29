import java.util.*;

class homework6 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	 //6번
	System.out.print("정수를 입력하시오 : ");
	int z = sc.nextInt();
	int t = 0;
	for(int n = 1; n<=z; n++) {
		if(n%5==0) {
			 t = t + n;
	        }
	}
	
	System.out.println("1부터" + z + "까지의 5의 배수의 합은" + t + "입니다.");
  }
}