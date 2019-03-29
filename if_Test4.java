class if_Test4 {
//main 입력
//int a=3 초기화
//a가 짝수이면 "짝수" 출력 a를 증가
/*{
	}
}
아니면 {
홀수 출력 a를 2감소
}
*/
  public static void main(String ar[]) {
    int a=3;
	if ((a%2)==0) {
		System.out.println("짝수");
		System.out.println(a++);
	}
	else {
		System.out.println("홀수");
		System.out.println(a-=2);
	}
}
}