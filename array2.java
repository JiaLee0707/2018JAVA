class array2 {
  public static void main(String ar[]) {

	int a[]=new int[100];
	int count=0;
	for(int n=0,i=1; n<a.length; n++,i++) { 
		a[n]=i;
		if(a[n]%4==0) {
			System.out.print(a[n]+" ");
			count++;
		}
		if(count==8) {
			System.out.println();
			count=0;
		}
	}
  }
}