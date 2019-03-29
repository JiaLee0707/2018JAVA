class Student_Test{
	public static void main(String ar[]){
		Student s1 = new Student();

		s1.name = "김현우";
		s1.num = "1";
		s1.addr = "서울";
		s1.telephone = "01011112222";

		System.out.println("이름은 " + s1.name + "이고 " + s1.num + "학년이고 " + "에 살고 전화번호는 " + s1.telephone + "입니다.");
	}
}