class vacation_homework4_6 {
  public static void main(String ar[]) {

	//�� ���� �ֻ����� ������ �� ���� ���� 2�� �Ǵ� ��� ����� ��
	int count=0;
	for(int i=1; i<=6; i++) {
		for(int j=1; j<=6; j++) {
			if((i+j)==2) {
				System.out.println(i+"+"+j+"="+(i+j)
					);
				count++;
			}
		}
	}
	System.out.println("���� ���� 2�� �Ǵ� ����� ���� "+count);
  }
}