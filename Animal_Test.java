class Animal_Test {
  public static void main(String ar[]) {

    Animal cat=new Animal(); //��ü ����
    cat.name="������";
    cat.owner="Mike";
	//Scanner sc=new Scanner(); -> ��ü ����

    System.out.println(cat.name);
    System.out.println(cat.owner);

    cat.bark();
    cat.eat();

	System.out.println("");

	Animal dog=new Animal();
	dog.name="��";
	dog.owner="Me";

	System.out.println(dog.name);
	System.out.println(dog.owner);

	dog.bark();
	dog.eat();

	System.out.println("");

	Animal brd=new Animal();
	brd.name="��";
	brd.owner="��ѱ�";

	System.out.println(brd.name);
	System.out.println(brd.owner);

	brd.bark();
	brd.eat();

  }
}