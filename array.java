/*�迭
1. 100~999������ ���� 6�ǹ���� �հ� ������ ���Ͻÿ�.
2. 1~100 ������ ���� ¦���� ���� ���*/

class array {
  public static void main(String ar[]) {
	int sum=0, count=0, num=100;
	int a[]=new int[900];
	for(int i=0; i<a.length; i++) {
		if(num<=999) {
			a[i]=num;
			num++;
		}
		if(a[i]%6==0) {
			sum+=a[i];
			count++;
		}
	}
	System.out.println("100~999���� 6�� ��� �� : " + sum);
	System.out.println("100~999���� 6�� ��� ���� : " + count);
  }
}