class vacation_homework4_4 {
  public static void main(String ar[]) {

	//1+(-2)+3+(-4)+...�� ���� ��� ���Ҷ� ������ 100�� �ɶ�
	int n=1, total=0;
	do {
		if(!(n%2==0)) {
			total+=n;
			if(!(total>=100)) {
				System.out.print(n+"+");
			}
			else {
				System.out.print(n);
			}
		}
		else {
			total-=n;
			if(!(total>=100)) {
				System.out.print("(-"+n+")+");
			}
			else {
				System.out.print("(-"+n+")");
			}
		}
		n++;
	}while(!(total==100));
	System.out.println("="+total);
	System.out.println("n="+(n-1)+"�϶� total="+total);
	//System.out.print("="+total);
 }
}