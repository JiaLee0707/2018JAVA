class if_Test4 {
//main �Է�
//int a=3 �ʱ�ȭ
//a�� ¦���̸� "¦��" ��� a�� ����
/*{
	}
}
�ƴϸ� {
Ȧ�� ��� a�� 2����
}
*/
  public static void main(String ar[]) {
    int a=3;
	if ((a%2)==0) {
		System.out.println("¦��");
		System.out.println(a++);
	}
	else {
		System.out.println("Ȧ��");
		System.out.println(a-=2);
	}
}
}