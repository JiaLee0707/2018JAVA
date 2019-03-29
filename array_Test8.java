import java.util.*;

class array_Test8 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
    //5번
    //키보드에서 10개의 double을 입력받아 평균 출력
    double a[]=new double[10];
    double total=0;
    System.out.print("10개의 double을 입력하시오 : ");
    for(int i=0;i<a.length; i++) {
		double b=sc.nextDouble();
		a[i]=b;
		total+=a[i];
    }
    System.out.println("10개의 double의 평균 : "+total/a.length);
 }
}
//숙제
//6,2,3,1,8 오름차순 정렬