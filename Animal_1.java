class Animal_1 {
 //private으로 name, owner, leg
	private String name, owner;
	private int leng;

	public Animal_1(String name, String owner, int leg) {
		this.name=name;
		this.owner=owner;
		this.leng=leng;
	}
	public Animal_1(String name, String owner) {
		this.name=name;
		this.owner=owner;
	}
	public Animal_1(String owner, int leng) {
		this.owner=owner;
		this.leng=leng;
	}
	//생성자

	public void setNam(String a) {
		System.out.println(a);
	}
	public void setOwner(String b) {
		System.out.println(b);
	}
	public String getName() {
		return name;
	}
	public String getOwner() {
		return owner;
	}
 //setNam(), getName()
 //setOwner(), getOwner()

	public static void main(String ar[]) {
		Animal_1 a1=new Animal_1("cat","mike",4);
		Animal_1 a2=new Animal_1("dog","alice");
		Animal_1 a3=new Animal_1("tom",3);
		
		a3.setNam("sheep");
		a2.setOwner("tomas");
		System.out.println(a3.getName());
		System.out.println(a3.getOwner());
	}

   //a3의 setNam()  "sheep"
   //a2의 setOwner()  "tomas"

   //a3의 getName()
   //a2의 getOwner()
}