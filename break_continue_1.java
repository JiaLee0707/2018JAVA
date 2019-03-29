class break_continue_1 {
 public static void main(String ar[]) {

  //1~10까지 3의 배수 제외출력(continue)
  for(int i=1; i<=10; i++) {
	if(i%3==0) {
		continue;
	}
	System.out.println(i);
  }
 }
}