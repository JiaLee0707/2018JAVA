abstract class Person30 {
	String name;
	int age;

	public void go() {
		System.out.println("����");
	}

	abstract public void walk();
	abstract public int count(int num); //�ο���
}
//Person30�� ��ü�� �������
//�׷���? ��ӹ޾Ƽ� �ڽ��� ������ ����������

abstract class child extends Person30 { //walk(), count()
	public void walk() {
		System.out.println("��å");
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