class Param_Test9 {
  public static void main(String ar[]) {
    
	//두개의 값을 입력받아 두 정수사이에 3의 배수이거나 7의 배수인 수들의 합과 평균 출력
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
	System.out.println("합 : "+sum);
	System.out.println("평균 : "+avg);
 }
}