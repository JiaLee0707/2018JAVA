class while_4 {
  public static void main(String ar[]) {

	//2��~9�ܱ��� ���(while 2��)
	int D=2;
	while(D<=9) {
		System.out.println(D+"��");
		int d=1;
		while(d<=9) {
			System.out.println(D+"*"+d+"="+D*d);
			d++;
		}
		System.out.println("--------------------------------------------");
		D++;
	}
  }
}