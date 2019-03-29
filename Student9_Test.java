class Student9 {
	String name;
	String id;
	String phone;
	String address;
	String Department;
	
	public void study() {
		System.out.println("공부하다");
	}
	public void eat() {
		System.out.println("먹다");
	}
	public void test() {
		System.out.println("시험보다");
	}
	public void act() {
		System.out.println("활동하다");
	}
		
}

class Leader extends Student9 {
	boolean president=true;
	public void hello() {
		System.out.println("인사하다");
	}
}
class Student9_Test {
	public static void main(String ar[]) {
		Leader l=new Leader();
		l.name="이지아";
		l.id="1217";
		l.phone="000-0000-0000";
		l.address="서울시 금천구";
		l.Department="뉴미디어소프트웨어과";
		
		System.out.println(l.name+"\n"+l.id+"\n"+l.phone+"\n"+l.address+"\n"+l.Department);
		l.study();
		l.eat();
		l.test();
		l.act();
	}
}
