class Sports {
	String name;
	int player;
	public Sports(String name, int player) {
		this.player = player;
		this.name = name;
	}
	public int getPlayer() {
		return player;
	}
	public void rule() {
		System.out.println("��� ��Ģ�� �ش� Ŭ�������� �ۼ��Ѵ�.");
	}
}
class BaseBall extends Sports {
	public BaseBall(String name, int player) {
		super(name,player);
		this.player=player;
		this.name=name;
	}
	public void rule() {
		System.out.println("3�� �ƿ��̸� ��");
	}
}

class BasketBall extends Sports {
	public BasketBall(String name, int player) {
		super(name, player);
		this.player=player;
		this.name=name;
	}
	public void rule() {
		System.out.println("�� ���� �ֱ�");
	}
}

class Sports_Test {
	public static void main(String ar[]) {
		BaseBall b=new BaseBall("�߱�", 9);
		System.out.println(b.name+" "+b.player);
		BasketBall B=new BasketBall("��", 15);
		System.out.println(B.name+" "+B.player);
	}
}