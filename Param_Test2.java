class Param_Test2 {
  public static void main(String ar[]) {
	
	//숫자 5개를 입력한 후 최대값, 최소값을 구하시오
	int a[]=new int[5];
    a[0]=Integer.parseInt(ar[0]);
    a[1]=Integer.parseInt(ar[1]);
    a[2]=Integer.parseInt(ar[2]);
    a[3]=Integer.parseInt(ar[3]);
    a[4]=Integer.parseInt(ar[4]);

    int max=a[0];
    int min=a[0];
	for(int i=0; i<a.length; i++) {
		if(max<a[i]) {
			max=a[i];
		}
		if(min>a[i]) {
			min=a[i];
		}
	}
	System.out.println("최댓값 : "+max);
	System.out.println("최솟값 : "+min);
  }
}