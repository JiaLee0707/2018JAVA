class array4 {
  public static void main(String ar[]) {
    
	int a[]=new int[2];
	for(int i=100; i<=999; i++) {
		if(!(i%4==0)) {
			a[0]++;
			a[1]+=i;
		}
	}
	System.out.println("4의 배수가 아닌 수들의 갯수 : "+a[0]);
	System.out.println("4의 배수가 아닌 수들의 합 : "+a[1]);
  }
}