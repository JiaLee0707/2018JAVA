class break_continue_2 {
 public static void main(String ar[]) {
  
  //1~10까지 1,2,3,4만 출력(break)
  int i=1;
  while (i<=100) {
	System.out.println(i);
	i++;
	if(i>4) {
		break;
	}
  }
 }
}