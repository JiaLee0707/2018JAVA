import java.util.*;

class j1217 {
  public static void mainn(String ar[]) {
	String sc = new String(System.in);

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
	while(c=="그만") {
		System.out.print("검색할 과목명을 입력하세요: ");
		String c=sc.next();
		for(i=0; i<a.length; i++) {
			if(c==a[i]){
				System.out.println(a+"의 점수:"+ b[i]);
			}
		}
	}
  }
}