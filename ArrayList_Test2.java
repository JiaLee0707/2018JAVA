import java.util.*;
//10���� �����͸� �Է¹޾Ƽ� �ִ밪 ���ϱ�
class ArrayList_Test2 {
public static void main(String ar[]) {
	ArrayList<Integer> list2=new ArrayList<Integer>();
	//for(�Է¹ޱ�) add();
	Scanner sc=new Scanner(System.in);
	int max=0;
	for(int i=0; i<10; i++) {
		list2.add(sc.nextInt());
		if(max<list2.get(i)) {
			max=list2.get(i);
		}
	}
	System.out.println(max);

	//���ؼ� �ִ밪 ���ϱ� get()
}
}