import java.util.*;

class soanner_Test2 {
  public static void main(String ar[]) {
     Scanner sc=new Scanner(System.in);
        //1번
		/*int a = sc.nextInt();
	    System.out.println("7로 나누었을 때 나머지"+ a%7);*/

		//2번
		/*int b = sc.nextInt();
		if((b>=60)) {
		   System.out.println("합격");
		  }
		else {
			System.out.println("불합격");
		} */
		
		//3번
		/*System.out.print("국어 점수를 입력하세요 : ");
		  int g = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		  int y = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		  int s = sc.nextInt();
		 int t = g+y+s;
		System.out.println("총점 :"+ t);
		System.out.println("평균 :"+ t/3);*/

		//4번
		/*System.out.print("10이하의 자연수를 입력하시오 : ");
		int n = sc.nextInt();
		if (n<=10) {
			for(int i = 1; i<=n; i++) {
			 System.out.print("Freeze");
			}
		}
		else {
			System.out.println("10이하의 자연수를 입력하시오.");
		}*/
		
		//5번
		/*System.out.print("x를 입력하시오 : ");
		  int x = sc.nextInt();
		System.out.print("y를 입력하시오 : ");
		  int y = sc.nextInt();
		if(((x&y)<=100)) {
			if(x<=y) {
				for(int i = x; i<=y; i++) {
					System.out.print(i);
				}
			}
			else if(y<=x) {
				for(int i = y; i<=x; i++) {
					System.out.print(i);
		    }	
			}
		}*/

		//6번
		/*System.out.print("정수를 입력하시오 : ");
		int z = sc.nextInt();
		int t = 0;
		for(int n = 1; n<=z; n++) {
			if(n%5==0) {
				 t = t + n;
			            }
		}
	
		System.out.println("1부터" + z + "까지의 5의 배수의 합은" + t + "입니다.");*/

		//7번
		/*for (int a=0; 1>a; ) {
			System.out.print("게임을 종료하시겠습니까?");
			int c = sc.nextInt ();
			if (c==1) {
				a=1;
				}
		    else if (c==0) {
				continue;
			}
			else {
				System.out.println("0(종료) 또는 1(계속)을 입력하십시오.");
			}
		}*/

		//8번
		/*int p = 0;
		int t = 0;
		int a = 0;
		while (a<1)
		{
		System.out.println("100이하의 정수를 입력하시오 : ");
		int n = sc.nextInt ();
		
		if(n<=100) {
			for (int i = 0; i<n; i++) {
				System.out.println("평균을 구하기 위한 정수를 입력하십시오.");
				int x = sc.nextInt ();
				t = t+x;
				}
			p = t/n;
			System.out.println("n개의 정수의 평균은 "+p+"입니다.");
			return;
		}
		}*/
/*
		else {
			System.out.println("100이하의 정수를 입력하시오.");
			}
*/		

		//9번
		/*int a = 1;
		int c = 0;

		for(a = 1; a<=100; a++) {

			if(a%4==0) {	
			
				System.out.print(a+" ");
			
				c=c+1;

			}

			if(c==8) {
				System.out.println("\n");
				c=0;
			}
		}*/


		//10번
		/*int count = 0;
		int t = 0;
		for(int x = 100; x<=999; x++) {
			if (x%7==0) {
				count=count+1;
				t=t+x;
			}
		}
		System.out.println("100부터 999까지 7의 배수의 갯수는 "+count+"입니다.");
		System.out.println("100부터 999까지 7의 배수의 합은 "+t+"입니다.");*/

		//11번
		/*int count = 0;
		int t = 0;
		for(int z = 100; z<=999; z++) {
			if(z%4!=0) {
				count=count+1;
				t=t+z;
			}
		}
		System.out.println("100부터 999까지 4의 배수가 아닌 갯수는 "+count+"입니다.");
		System.out.println("100부터 999까지 4의 배수가 아닌 합은 "+t+"입니다.");*/

		//12번
		/*for(int n=1; n<=100; n++) {
			if(n%3==0&n%5==0) {
				System.out.println(n);
			}
		}*/

		//13번
		/*for(int n=1; n<=100; n++) {
			if(n%7==0|n%11==0) {
				System.out.println(n);
			}
		}*/

		//14번
		/*for(char n=65; n<=90; n++) {
			System.out.println(n);
		}*/

		//15번
		/*for(char n=97; n<=122; n++) {
			System.out.println(n);
		}*/
		
		//16번
		/*for(char n=65; n<=90; n++) {
			if(n<=65) {
				for(n=97; n<=122; n++) {
					System.out.println(n);
				}
			}
		}*/

		//17번
		/*System.out.println("구구단\n");
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
				for(int j=1; j<=9; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
				System.out.println("----------------------------------");
		}*/


		//18번
		/*for(int a=1; a<=9; a++) {
			for(int b=1; b<=9; b++) {
				if(a+b==14) {
					System.out.println(a+" "+b);
				}
			}
		}*/

		//19번
		/*for(int n=1; n<=100; n++) {
			if(((n%3)==0)&((n%5)!=0)&((n%9)!=0)) {
					System.out.println(n);
			}
		}*/
		
		//20번
		/*int n=sc.nextInt();
		for(int s=1; s<=n; n--) {
			for(int i=1; i<=n; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		*/

		//21번==8번
		/*int p = 0;
		int t = 0;
		int a = 0;
		while (a<1)
		{
		System.out.println("100이하의 정수를 입력하시오 : ");
		int n = sc.nextInt ();
		
		if(n<=100) {
			for (int i = 0; i<n; i++) {
				System.out.println("평균을 구하기 위한 정수를 입력하십시오.");
				int x = sc.nextInt ();
				t = t+x;
				}
			p = t/n;
			System.out.println("n개의 정수의 평균은 "+p+"입니다.");
			return;
		}
		}*/

		//22번
		/*int a = 0;
		int j = 0;
		int h = 0;
		while (a<1)
		{
			for(int c = 1; c<=10; c++) {
				System.out.println("정수를 입력하시오 : ");
				int n = sc.nextInt() ;
				if(n%2==0) {
					j+=1;
				}
				if(n%2!=0) {
					h+=1;
				}
			}
			a=1;
		}
		System.out.println("짝수의 갯수는"+ j +"입니다.");
		System.out.println("홀수의 갯수는"+ h +"입니다.");	*/

		//23번
		/*int s = 0;
		int p = 0;
		System.out.print("두 개의 정수를 입력하시오 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a<=b) {
			for(int x = a; x<=b; x++) {
				if(((x%3)==0)|((x%5)==0)) {
					s = s+x;
				}
			}
			p = s/(b-a);
		}
		else if (b<=a) {
			for(int x = b; x<=a; x++) {
				if(((x%3)==0)|((x%5)==0)) {
					s = s+x;
				}
			}
			p = s/(a-b);
		}

		System.out.println(a + "와(과)" +b+"사이에서 3의 배수이거나 5의 배수인 수들의 합은"+s+"이고 평균은"+p+"입니다.");*/

		//24번
		System.out.print("자연수 한개를 입력하시오 : ");
		int one = sc.nextInt();
			for(int i = 1; i<=10; i++) {
				System.out.println(one*i);
			}




 }
}