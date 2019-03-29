class Test9 {
	int a;
	int b;

	//생성자 3개 만들어 this()로 호출
	public Test9(int a, int b) {
		this(a);
		this.b=20;
	}
	public Test9(int a) {
		this();
	}
	public Test9() {
		this.a=10;
	}

	public static void main(String ar[]) {
		Test9 t=new Test9(10,20);

		System.out.println(t.a+"\n"+t.b);
	}
}
//실행순서 : 17-18-6-7-10-11-13-14-12-8-20