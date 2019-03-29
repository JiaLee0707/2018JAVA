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
		System.out.println("경기 규칙은 해당 클래스에서 작성한다.");
	}
}
class BaseBall extends Sports {
	public BaseBall(String name, int player) {
		super(name,player);
		this.player=player;
		this.name=name;
	}
	public void rule() {
		System.out.println("3진 아웃이면 패");
	}
}

class BasketBall extends Sports {
	public BasketBall(String name, int player) {
		super(name, player);
		this.player=player;
		this.name=name;
	}
	public void rule() {
		System.out.println("골 많이 넣기");
	}
}

class Sports_Test {
	public static void main(String ar[]) {
		BaseBall b=new BaseBall("야구", 9);
		System.out.println(b.name+" "+b.player);
		BasketBall B=new BasketBall("농구", 15);
		System.out.println(B.name+" "+B.player);
	}
}