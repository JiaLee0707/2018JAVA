class Param15 {
  public static void main(String ar[]) {

    int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);

	int i, sum=0, avg=0, count=0;
	if(n>m) {
		for(i=m; i<=n; i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
				count++;
			}
		}
	}
	else if(m>n) {
		for(i=n; i<=m; i++) {
			if(i%3==0||i%5==0) {
				sum+=i;
				count++;
			}
		}
	}
	avg=sum/count;
	System.out.println("�� ���� ���̿� 3�� ����̰ų� 5�� ����� ������ �հ� ���");
	System.out.println("�� : "+sum+" ��� : "+avg);
  }
}