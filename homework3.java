import java.util.*;

class homework3 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
	//3번
	System.out.print("국어 점수를 입력하세요 : ");
	 int g = sc.nextInt();
	System.out.print("영어 점수를 입력하세요 : ");
	int y = sc.nextInt();
	System.out.print("수학 점수를 입력하세요 : ");
	 int s = sc.nextInt();
	 int t = g+y+s;
	System.out.println("총점 :"+ t);
	System.out.println("평균 :"+ t/3);
  }
}