class Param_Test6 {
  public static void main(String ar[]) {

    //���� 2���� �� ���� �� ������ �� �� ���ϱ� (n~m)
	int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);

	int i,sum=0;
	if(n>m) {
		for(i=m; i<=n; i++) {
			sum+=i;
		}
	}
	else {
		for(i=n; i<=m; i++) {
			sum+=i;
		}
	}
	System.out.println(sum);
  }
}