class A	{
	public A() {
		System.out.println("������A");
	}

	A(int x) {
		System.out.println("�Ű�����������A");
	}
}
class B extends A {
	B() {
		System.out.println("������B");
	}
	public B(int x) {//x=5
		//super();
		System.out.println("�Ű�����������B");
	}
}
class C {
	public static void main(String ar[]) {
		B b=new B(5);
	}
}

//�������
//19~-14-2~3-11~13