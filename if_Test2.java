class if_Test2 {
//main �Է�
//int a=3 �ʱ�ȭ
//a�� ����̸� "��� ���
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