import java.util.*;
class j1207{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		String str[];
		str=new String [5];
		System.out.println("5개의 과목명을 입력하세요.");
		for(int i=0;i<str.length;i++){
			str[i]=sc.next();
		}
    	System.out.println("======================");
		int score[];
		score=new int[5];
		System.out.println("5개의 점수를 입력하세요.");
		for(int j=0;j<score.length;j++){
			score[j]=sc.nextInt();
		}
		System.out.println("======================");
	int total=0;
	for(int z=0;z<score.length;z++){
		total+=score[z];
	}
System.out.println("과목 총점>>"+total);
System.out.println("과목 평균>>"+total/5);
int high=0;
int low=0;
for(int w=0;w<str.length;w++){
	for(int y=1;y<5;y++){
		if(score[w]>score[y]){
			high=score[w];
			low=score[y];
		}
		else if(score[w]<score[y]){
			high=score[y];
			low=score[w];
		}
	}
}
System.out.println("최고점수>>"+high);
System.out.println("최저점수>>"+low);
System.out.println("======================");
	}
}