class Animal_Test {
  public static void main(String ar[]) {

    Animal cat=new Animal(); //객체 생성
    cat.name="고양이";
    cat.owner="Mike";
	//Scanner sc=new Scanner(); -> 객체 생성

    System.out.println(cat.name);
    System.out.println(cat.owner);

    cat.bark();
    cat.eat();

	System.out.println("");

	Animal dog=new Animal();
	dog.name="개";
	dog.owner="Me";

	System.out.println(dog.name);
	System.out.println(dog.owner);

	dog.bark();
	dog.eat();

	System.out.println("");

	Animal brd=new Animal();
	brd.name="새";
	brd.owner="비둘기";

	System.out.println(brd.name);
	System.out.println(brd.owner);

	brd.bark();
	brd.eat();

  }
}