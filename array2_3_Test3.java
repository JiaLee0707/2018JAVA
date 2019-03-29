import java.util.*;

class array2_3_Test3 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    //5명의 국영수 성적을 입력받아 총점, 평균 구하기
	//이름, 석차 추가
	/*int id[]=new int[5];
	int kor[]=new int[5];
	int eng[]=new int[5];
	int mat[]=new int[5];
	int total[]=new int[5];
	float avg[]=new float[5];
	
	int n=0;
	while(n<6) {
		System.out.print("학번 : ");
		id[n]=sc.nextInt();
		System.out.print("국어 : ");
		kor[n]=sc.nextInt();
		System.out.print("영어 : ");
		eng[n]=sc.nextInt();
		System.out.print("수학 : ");
		mat[n]=sc.nextInt();
		total[n]=kor[n]+eng[n]+mat[n];
		avg[n]=total[n]/(float)3;
		n++;
	}
	System.out.println("학번  국  영  수  총점  평균");
	System.out.println("--------------------------------");
	for(n=0; n<id.length; n++) {
		System.out.println(id[n]+"  "+kor[n]+"  "+eng[n]+"  "+mat[n]+"   "+total[n]+"   "+avg[n]);
	}*/

	String name[]=new String[5];
	int a[][]=new int[5][7];
	int i, j;
	System.out.println("5명의 (이름, 학번, 국, 영, 수)를 입력하시오.");
	for(i=0; i<a.length; i++) {
		name[i]=sc.next();
		a[i][0]=sc.nextInt();
		for(j=1; j<=3; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0; i<a.length; i++) {
		for(j=1; j<=3; j++) {
			a[i][4]+=a[i][j]; //합계
			a[i][5]=a[i][4]/3; //평균
		}
	}

	for(i=0; i<a.length; i++) {
		a[i][6]=1;
	}
	for(i=0; i<a.length; i++) {
		for(j=1; j<a.length; j++) {
			if(a[i][5]>a[j][5]) {
				a[j][6]++;
			}
		}
	}

	System.out.println("이름   학번  국  영  수 총점 평균 석차");
	System.out.println("------------------------------------------");
	for(i=0; i < a.length; i++) {
		System.out.print(name[i] + " ");
		for(j=0; j<a[0].length; j++) {
			System.out.print(a[i][j] + "  ");
		}
		System.out.println();
	}
  }
}