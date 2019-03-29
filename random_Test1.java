import java.util.*;

class random_Test1 {
 public static void main(String ar[]) {
  Scanner sc=new Scanner(System.in);
   Random r=new Random();

   int no=r.nextInt(100);
   System.out.println("총 10번의 기회가 있습니다.");
   System.out.println("1~100사이의 숫자를 맞춰보세요.");

   int conut=1;
   do {
		System.out.print(conut+"번째 : ");
		int me = sc.nextInt();
		if(me==no) {
			System.out.println("정답입니다.");
			break;
		}
		else if(me<no) {
			System.out.println("더 높습니다.");
		}
		else if(me>no) {
			System.out.println("더 작습니다.");
		}
		conut++;
   }while (conut<=10);
   if(conut>10) {
	   System.out.println("");
	   System.out.println("실패입니다.");
   }
 }
}