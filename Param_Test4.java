class Param_Test4 {
  public static void main(String ar[]) {
    
	//2개의 값을 입력받아서 두 개 값 사이 수 구하기 (n~m)
	int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);
	int count=0;
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