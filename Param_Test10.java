class Param_Test10 {
  public static void main(String ar[]) {
    
    //5개의 수를 입력받아 최대값,최소값 출력.
	int a[]=new int[5];
	int i;
	for(i=0; i<a.length; i++) {
		a[i]=Integer.parseInt(ar[i]);
	}
	int max=a[0],min=a[0];
	for(i=0; i<a.length; i++) {
		if(max<a[i]) {
			max=a[i];
		}
		if(min>a[i]) {
			min=a[i];
		}
	}
	System.out.println("최대값 : "+max);
	System.out.println("최소값 : "+min);
 }
}