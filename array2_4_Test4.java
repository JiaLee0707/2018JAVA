import java.util.*;

class array2_4_Test4 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    //������ �������� ��������
	String name[]=new String[5];
	int a[][]=new int[5][7];
	int i, j;
	System.out.println("5���� (�̸�, �й�, ��, ��, ��)�� �Է��Ͻÿ�.");
	for(i=0; i<a.length; i++) {
		name[i]=sc.next();
		a[i][0]=sc.nextInt();
		for(j=1; j<=3; j++) {
			a[i][j]=sc.nextInt();
		}
	}
	for(i=0; i<a.length; i++) {
		for(j=1; j<=3; j++) {
			a[i][4]+=a[i][j]; //�հ�
			a[i][5]=a[i][4]/3; //���
		}
	}

	for(i=0; i<a.length; i++) {
		a[i][6]=1;
	}
	for(i=0; i<a.length; i++) {
		for(j=1; j<a.length; j++) {
			if(a[i][5]>a[j][5]) {
				a[j][6]++;               //������
			}
		}
	}

	System.out.println("�̸�   �й�  ��  ��  �� ���� ��� ����");
	System.out.println("------------------------------------------");
	for(i=0; i < a.length; i++) {
		System.out.print(name[i] + " ");
		for(j=0; j<a[0].length; j++) {
			System.out.print(a[i][j] + "  ");
		}
		System.out.println();
	}
	for(i=0; i<a.length; i++) {
		for(j=i+1; j<a.length; j++) {
			for(int c=i; c<a.length; c++) {
				if(a[i][6]<a[j][6]) {
					String x=name[i];
					name[i]=name[j];
					name[j]=x;//�̸� ����
					int y=a[i][6];
					a[i][6]=a[j][6];
					a[j][6]=y;//���� ����			
					int x2=a[i][i];
					a[i][i]=a[c][i];
					a[c][i]=x2;//�й�..?
				}
			}
		}
	}
	System.out.println("�̸�   �й�  ��  ��  �� ���� ��� ����(��������)");
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