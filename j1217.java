import java.util.*;

class j1217 {
  public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);

    int i, total=0;
    float avg;
    String a[] = new String[5];
    System.out.println("5개의 과목명 입력하세요>>:");
    for(i=0; i<a.length; i++) {
		  a[i]=sc.next();
    }
    System.out.println("===============================");
    System.out.println("5개의 점수를 입력하세요>>:");
    int b[] = new int[5];
    for(i=0; i<a.length; i++) {
	 	  b[i]=sc.nextInt();
		  total+=b[i];
    }
	int min=b[1], max=b[1];
	for(i=0; i<a.length; i++) {
		if(b[i]>max) {
			max=b[i];
		}
		if(b[i]<min) {
			min=b[i];
		}
	}
    avg=(float)total/5;
    System.out.println("===============================");
    System.out.println("과목 총점>>"+total);
    System.out.println("과목 평균>>"+avg);
	System.out.println("최고점수>>"+max);
	System.out.println("최저점수>>"+min);
	System.out.println("===============================");

	String c = "예";
	while(!("그만".equals(c))) {
		System.out.print("검색할 과목명을 입력하세요: ");
		c=sc.next();
		for(i=0; i<a.length; i++) {
			if(a[i].equals(c)){
				System.out.println(a[i]+"의 점수:"+ b[i]);
			}
		}
	}
  }
}