import java.util.*;

class array_Test5 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	//2번
	//키보드로부터 10개의 정수를 입력받아 배열에 정장하고
	//이 중에서 3의 배수인 수만 골라 출력
    int i[];
    i=new int[10];

    for(int x=0; x<i.length; x++) {
		int y=sc.nextInt();
		i[x]=y;
		if(y%3==0) {
			System.out.println(i[x]);
		}
    }
	
 }
}