class array_Test1 {
  public static void main(String ar[]) {
  //intŸ���� �迭 a ����
  //int �� 5�� ����

  //�� �ֱ� (for������: 1,2,3,4,5)

  //�迭�� ����ִ� �� ���(for������)

  //�迭�� ũ�� ���

  int a[];
  a = new int[5];
  //int a[] = new int[5];

  for(int i=0; i<=4; i++) {
	a[i] = i+1;
	System.out.println(a[i]);
  }
  System.out.println("�迭�� ũ��� "+a.length);
 }
}