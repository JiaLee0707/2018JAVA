import java.util.*;

class break_continue_3 {
 public static void main(String ar[]) {

  //1~100 더할때 100이 넘는 숫자 구하기
  int i=1;
  int sum=0;
  do {
	sum+=i;
	if(sum>100) {
		System.out.println(i);
		System.out.println(sum);
		break;
	}
	i++;
  }while(i<=100);
 }
}