class array3 {
  public static void main(String ar[]) {
    
    int a[]=new int[2];
	int count=0;
	for(int i=100; i<=999; i++) {
		if(i%7==0) {
			a[1]+=i;
			count++;
		}
	}
	a[0]=count;
	System.out.println("7의 배수의 갯수 : "+a[0]);
	System.out.println("7의 배수의 합 : "+a[1]);
  }
}