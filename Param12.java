class Param12 {
  public static void main(String ar[]) {
    
    int n=Integer.parseInt(ar[0]);
	int sum=0;
	for(int i=1; i<=n; i++) {
		if(i%5==0) {
			sum+=i;
		}
	}
	System.out.println("5의 배수의 합 : "+sum);
  }
}