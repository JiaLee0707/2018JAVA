class array_Test1 {
  public static void main(String ar[]) {
  //int타입의 배열 a 선언
  //int 방 5개 생성

  //값 넣기 (for문으로: 1,2,3,4,5)

  //배열에 들어있는 값 출력(for문으로)

  //배열의 크기 출력

  int a[];
  a = new int[5];
  //int a[] = new int[5];

  for(int i=0; i<=4; i++) {
	a[i] = i+1;
	System.out.println(a[i]);
  }
  System.out.println("배열의 크기는 "+a.length);
 }
}