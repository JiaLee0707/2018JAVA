class Student9 {
	String name;
	String id;
	String phone;
	String address;
	String Department;
	
	public void study() {
		System.out.println("�����ϴ�");
	}
	public void eat() {
		System.out.println("�Դ�");
	}
	public void test() {
		System.out.println("���躸��");
	}
	public void act() {
		System.out.println("Ȱ���ϴ�");
	}
		
}

class Leader extends Student9 {
	boolean president=true;
	public void hello() {
		System.out.println("�λ��ϴ�");
	}
}
class Student9_Test {
	public static void main(String ar[]) {
		Leader l=new Leader();
		l.name="������";
		l.id="1217";
		l.phone="000-0000-0000";
		l.address="����� ��õ��";
		l.Department="���̵�����Ʈ�����";
		
		System.out.println(l.name+"\n"+l.id+"\n"+l.phone+"\n"+l.address+"\n"+l.Department);
		l.study();
		l.eat();
		l.test();
		l.act();
	}
}
