class Animal8 {
	int leg;
	String color;
	String owner;

	public String run() {
		return "¶Ù´Ù";
	}
}

class Rabbit extends Animal8 {
	public String run() {
		return "±øÃÑ±øÃÑ¶Ù´Ù";
	}
}

class Tiger extends Animal8 {
	public String run() {
		return "¼ºÅ­¼ºÅ­¶Ù´Ù";
		//System.out.println("¼ºÅ­¼ºÅ­¶Ù´Ù");
	}
	public String eat() {
		return "³È³È";
		//System.out.println("³È³È");
	}
}

class extend_Test2 {
	public static void main(String ar[]) {
		Rabbit r=new Rabbit();//4, "Èò»ö", "Åä³¢ÁÖÀÎ");
		Tiger t=new Tiger();//	4, "ÁÖÈ²°ËÁ¤", "È£¶ûÀÌÁÖÀÎ");
		r.leg=4;
		r.color="Èò»ö";
		r.owner="Åä³¢ÁÖÀÎ";
		t.leg=4;
		t.color="ÁÖÈ²°ËÁ¤";
		t.owner="È£¶ûÀÌÁÖÀÎ";
		System.out.println(r.leg+" " +r.color+" "+r.owner+" "+t.leg+" "+t.color+" "+t.owner);
		System.out.println(t.eat());
		//¸â¹öº¯¼ö °ª³Ö°í Ãâ·Â
		//¸Ş¼­µå È£Ãâ
	}
}