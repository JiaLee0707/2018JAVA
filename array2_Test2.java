class array2_Test2 {
  public static void main(String ar[]) {
    int a[][];
    a = new int[2][3];

    a[0][0]=10;
    a[0][1]=20;
    a[0][2]=30;
    a[1][0]=40;
    a[1][1]=50;
    a[1][2]=60;
	
	int n=0;
	for(int i=0; i<a.length; i++) {
		for(int j=0; j<a[i].length; j++) {
			a[i][j]=n+10;
			n=n+10;
			System.out.println(a[i][j]);
		}
	}
 }
}