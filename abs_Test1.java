abstract class Person30 {
	String name;
	int age;

	public void go() {
		System.out.println("가다");
	}

	abstract public void walk();
	abstract public int count(int num); //인원수
}
//Person30은 객체를 못만들어
//그래서? 상속받아서 자식이 몸통을 만들어줘야해

abstract class child extends Person30 { //walk(), count()
	public void walk() {
		System.out.println("산책");
	}
}

class child1 extends child {
	public int count(int num) {
		return num;
	}
}


class abs_Test1 {
	public static void main(String ar[]) {
		//child c=new child();
		child1 c1=new child1();
		//c.walk();
		System.out.println(c1.count(30));
	}
}