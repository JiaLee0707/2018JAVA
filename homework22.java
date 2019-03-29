import java.util.*;

class homework22 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	    //22번
		int a = 0;
		int j = 0;
		int h = 0;
		while (a<1)
		{
			for(int c = 1; c<=10; c++) {
				System.out.println("정수를 입력하시오 : ");
				int n = sc.nextInt() ;
				if(n%2==0) {
					j+=1;
				}
				if(n%2!=0) {
					h+=1;
				}
			}
			a=1;
		}
		System.out.println("짝수의 갯수는"+ j +"입니다.");
		System.out.println("홀수의 갯수는"+ h +"입니다.");	
  }
}