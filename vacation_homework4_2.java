class vacation_homework4_2 {
  public static void main(String ar[]) {

    //1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ����
    int total=0;
    for(int i=1; i<=20; i++) {
		if(!((i%2==0)&&(i%3==0))) {
			total+=i;
		}
    }
    System.out.println("1~20 2,3�� ����� �ƴ� ���� ���� : "+total);
  }
}