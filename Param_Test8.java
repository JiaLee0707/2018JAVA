class Param_Test8 {
  public static void main(String ar[]) {
    
	//n,m�� �Է¹޾� n���� m������ ������ ����� ���Ͻÿ�
	int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);
	int i,sum=0,count=0,avg;
	if(n<m) {
		for(i=n; i<m; i++) {
			sum+=i;
			count++;
		}
	}
	else {
		for(i=m+1; i<n-1; i++) {
			sum+=i;
			count++;
		}
	}
	avg=sum/count;
	System.out.println(avg);
 }
}