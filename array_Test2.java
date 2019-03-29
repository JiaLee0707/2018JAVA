class array_Test2 {
  public static void main(String ar[]) {
  //char 타입의 배열 c 선언
  //A~Z까지 넣기(for문으로)

  //c에 있는 값들 출력

  //배열의 크기 출력

  char c[]=new char[26];
  
  for(int i=0; i<c.length; i++) {
	c[i] = (char)(i+65);
	System.out.println(c[i]);
  }
  System.out.println("배열의 크기는 "+c.length);
 }
}