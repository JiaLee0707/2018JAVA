class while_4 {
  public static void main(String ar[]) {

	//2단~9단까지 출력(while 2번)
	int D=2;
	while(D<=9) {
		System.out.println(D+"단");
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