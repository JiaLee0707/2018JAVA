class Param_Test9 {
  public static void main(String ar[]) {
    
	//�ΰ��� ���� �Է¹޾� �� �������̿� 3�� ����̰ų� 7�� ����� ������ �հ� ��� ���
	int a=Integer.parseInt(ar[0]);
	int b=Integer.parseInt(ar[1]);
	int i,sum=0,count=0,avg=0;
	if(a<b) {
		for(i=a; i<=b; i++) {
			if((i%3==0)||(i%7==0)) {
				sum+=i;
				count++;
			}
		}
	}
	else {
		for(i=b; i<=a; i++) {
			if((i%3==0)||(i%7==0)) {
				sum+=i;
				count++;
			}
		}
	}
	avg=sum/count;
	System.out.println("�� : "+sum);
	System.out.println("��� : "+avg);
 }
}