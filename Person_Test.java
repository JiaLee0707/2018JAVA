class Person_Test {
  public static void main(String ar[]) {
    
	person p1=new person1();
	p1.name="Mike";
	p1.age=30;

	System.out.println(p1.name);
	System.out.println(p1.age);

	p1.eat();
	p1.study();

	person1 p2=new person1();
	p2.name="Tom";
	p2.age=25;

	System.out.println(p2.name);
	System.out.println(p2.age);

	p2.eat();
	p2.study();


  }
}