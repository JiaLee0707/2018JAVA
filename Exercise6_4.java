class Exercise6_4 {
	public static void main(String args[]) {
			Student s=new Student();
			s.name = "ȫ�浿";
			s.ban = 1;
			s.no = 1;
			s.kor = 100;
			s.eng = 60;
			s.math = 76;
			System.out.println("�̸�:"+s.name);
			System.out.println("����:"+s.getTotal());
			System.out.println("���:"+s.getAverage());
	}
}

class Student {
	public String name;
	public int ban, no, kor, eng, math;

	int total;
	float average;

	public int getTotal() {
		total = kor + eng + math;

		return total;
	}
	public float getAverage() {
		average = (float)total/3;
		return average;
	}
}