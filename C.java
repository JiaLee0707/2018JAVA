class A	{
	public A() {
		System.out.println("생성자A");
	}

	A(int x) {
		System.out.println("매개변수생성자A");
	}
}
class B extends A {
	B() {
		System.out.println("생성자B");
	}
	public B(int x) {//x=5
		//super();
		System.out.println("매개변수생성자B");
	}
}
class C {
	public static void main(String ar[]) {
		B b=new B(5);
	}
}

//실행순서
//19~-14-2~3-11~13