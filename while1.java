import java.util.*;

class while1 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);

     int n= sc.nextInt();
     int n2 = sc.nextInt();
     int count = 0;

     int i = n;
     while(i>=n2) {
		if(i%5==0) {
			 count++;
		}
	  i++;
     }
     System.out.println("5의 배수인 수들의 개수="+count);
  }
}