class Student_1 {
	private String name;
	private int grade, ban, telephone;

	public Student_1(String name) {
		this.name=name;
	}
	public Student_1(String name, int grade, int ban, int telephone) {
		this.name=name;
		this.ban=ban;
		this.grade=grade;
		this.telephone=telephone;
	}
	public Student_1(String name, int ban, int telephone) {
		this.name=name;
		this.ban=ban;
		this.telephone=telephone;
	}
	public Student_1(int grade, int ban, int telephone) {
		this.grade=grade;
		this.ban=ban;
		this.telephone=telephone;
	}
	public String study(String a) {
		return a;
	}

	public static void main(String ar[]) {
		Student_1 s1=new Student_1("�����");
		Student_1 s2=new Student_1("������");
		Student_1 s3=new Student_1("Tomas",1,1,111);
		Student_1 s4=new Student_1("John",6,222);
		Student_1 s5=new Student_1(2,5,333);

		System.out.println(s3.name+"�� "+s3.grade+"�г��̰� ��ȭ��ȣ�� "+s3.telephone+"�Դϴ�");
		System.out.println(s5.study("�����ϴ�"));
	}
}