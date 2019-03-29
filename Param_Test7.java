class Param_Test7 {
  public static void main(String ar[]) {

    //100이하의 두개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력	
	int n=Integer.parseInt(ar[0]);
	int m=Integer.parseInt(ar[1]);
	if((n&m)>=100) {
		System.out.println("100이하의 정수가 아닙니다.");
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