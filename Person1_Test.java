class person1 {

	String name;
	int age;

	public void eat() {
		System.out.println("�Դ�");
	}
	public void study() {
		System.out.println("Java");
	}
}
class Person1_Test
{

 public static void main(String ar[]) {
    
	person1 p1=new person1();
	p1.name="Mike";
	p1.age=30;

	System.out.println(p1.name);
	System.out.println(p1.age);

	p1.eat();
	p1.study();
}
}