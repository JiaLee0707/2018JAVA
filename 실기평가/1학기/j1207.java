import java.util.*;
class j1207{
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		String str[];
		str=new String [5];
		System.out.println("5���� ������� �Է��ϼ���.");
		for(int i=0;i<str.length;i++){
			str[i]=sc.next();
		}
    	System.out.println("======================");
		int score[];
		score=new int[5];
		System.out.println("5���� ������ �Է��ϼ���.");
		for(int j=0;j<score.length;j++){
			score[j]=sc.nextInt();
		}
		System.out.println("======================");
	int total=0;
	for(int z=0;z<score.length;z++){
		total+=score[z];
	}
System.out.println("���� ����>>"+total);
System.out.println("���� ���>>"+total/5);
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
System.out.println("�ְ�����>>"+high);
System.out.println("��������>>"+low);
System.out.println("======================");
	}
}