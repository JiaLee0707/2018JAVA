//1~100 사이의 수중 짝수의 합인 출력
class array_2 {
	public static void main(String ar[]) {
		int sum=0, n=1;
		int num[]=new int[99];
		for(int i=0; i<num.length; i++) {
			if(num[i]<=100) {
				num[i]=n;
				n++;
			}
			if(num[i]%2==0) {
				sum+=num[i];
			}
		}
		System.out.println("1~100 사의의 짝수 합 : "+sum);
	}
}