import java.util.*;

class NYPC_1 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	int P, Q, W, i=0, j=0;
	P=sc.nextInt();
	Q=sc.nextInt();
	if(P>=1 && P<=500000 && Q>=1 && Q<=500000) {
		W=sc.nextInt();
		if(W>=1 && W<=1000000) {
			for(i=0; i<= 50000; i++) {
				for(j=0; j<= 500000; j++) {
					if(i*P+j*Q==W){
						System.out.println(i+" "+j);
					}
				}
			}
		}
	}
  }
}