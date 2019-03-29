class Param_Test8 {
  public static void main(String ar[]) {
    
	//n,m을 입력받아 n부터 m사이의 정수의 평균을 구하시오
	int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);
	int i,sum=0,count=0,avg;
	if(n<m) {
		for(i=n; i<m; i++) {
			sum+=i;
			count++;
		}
	}
	else {
		for(i=m+1; i<n-1; i++) {
			sum+=i;
			count++;
		}
	}
	avg=sum/count;
	System.out.println(avg);
 }
}