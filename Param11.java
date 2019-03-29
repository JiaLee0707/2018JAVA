class Param11 {
  public static void main(String ar[]) {

	int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);
	if(n>m) {
		for(int i=m; i<=n; i++) {
			System.out.println(i);
		}
	
	}
	else {
		for(int i=n; i<=m; i++) {
			System.out.println(i);
		}
	}
 }
}