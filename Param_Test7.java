class Param_Test7 {
  public static void main(String ar[]) {

    //100������ �ΰ��� ������ �Է¹޾� ���� ������ ū ������ ���ʴ�� ���	
	int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);
	if((n&m)>=100) {
		System.out.println("100������ ������ �ƴմϴ�.");
		//continue;
	}
	else if((n&m)<=100) {
		if(n<m) {
			for(int i=n; i<=m; i++) {
				System.out.println(i);
			}
		}
		else {
			for(int i=m; i<=n; i++) {
				System.out.println(i);
			}
		}
	}
 }
}