class if_Test2 {
//main 입력
//int a=3 초기화
//a가 양수이면 "양수 출력
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