class Param15 {
  public static void main(String ar[]) {

    int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);

	int i, sum=0, avg=0, count=0;
	if(n>m) {
		for(i=m; i<=n; i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
				count++;
			}
		}
	}
	else if(m>n) {
		for(i=n; i<=m; i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
				count++;
			}
		}
	}
	avg=sum/count;
	System.out.println("두 정수 사이에 3의 배수이거나 5의 배수인 수들의 합과 평균");
	System.out.println("합 : "+sum+" 평균 : "+avg);
  }
}