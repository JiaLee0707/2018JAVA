/*배열
1. 100~999사이의 수중 6의배수의 합과 갯수를 구하시오.
2. 1~100 사이의 수중 짝수의 합인 출력*/

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
	System.out.println("100~999까지 6의 배수 합 : " + sum);
	System.out.println("100~999까지 6의 배수 갯수 : " + count);
  }
}