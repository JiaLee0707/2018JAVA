class Param_Test4 {
  public static void main(String ar[]) {
    
	//2���� ���� �Է¹޾Ƽ� �� �� �� ���� �� ���ϱ� (n~m)
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