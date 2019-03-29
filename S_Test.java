class Student_2 {
	private String name;
	private String grade;

	public void setName(String s) {
		name=s;
	}
	public String getName() {
		return name;
	}
}


class S_Test {
	public static void main(String ar[]) {
		Student_2 s1=new Student_2();
		s1.setName("Tom");
		System.out.println(s1.getName());
	}
}