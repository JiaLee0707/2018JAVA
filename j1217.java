import java.util.*;

class j1217 {
  public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);

    int i, total=0;
    float avg;
    String a[] = new String[5];
    System.out.println("5���� ����� �Է��ϼ���>>:");
    for(i=0; i<a.length; i++) {
		  a[i]=sc.next();
    }
    System.out.println("===============================");
    System.out.println("5���� ������ �Է��ϼ���>>:");
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
    System.out.println("���� ����>>"+total);
    System.out.println("���� ���>>"+avg);
	System.out.println("�ְ�����>>"+max);
	System.out.println("��������>>"+min);
	System.out.println("===============================");

	String c = "��";
	while(!("�׸�".equals(c))) {
		System.out.print("�˻��� ������� �Է��ϼ���: ");
		c=sc.next();
		for(i=0; i<a.length; i++) {
			if(a[i].equals(c)){
				System.out.println(a[i]+"�� ����:"+ b[i]);
			}
		}
	}
  }
}