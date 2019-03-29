class person7 {
	String name;
	int age;
	int height;

	person7(String n, int h) {
		this(h);
		this.name="ALICE";
}
	person7 (String naem, int age, int height) {
		this(naem, height);
		this.age=25;
	}
	
	person7(int x) {
		this();
		this.naem="Tom";
	}
	person7() {
		this.heigth=180;
	}

	public static void main(String ar[]) {
		person7 p=new person7("Mike",30,180);
		System.out.println(p.name+"\n"+p.age"\n"+p.height);
	}
}
//23-24-10-11-6-7-15-16-19-20-17-7-8-12-15