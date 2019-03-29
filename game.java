import java.util.*;

interface starcraft {
	Scanner sc=new Scanner(System.in);
	Random r=new Random();
	int MAX=10;
	int MIN=0;

	public void movable();
	public void attackable();
}

class zerg implements starcraft {
	int x=r.nextInt(10);
	int y=r.nextInt(10);
	String color;
	int heart=5;

	public void movable() {
		String zm=sc.next();
		switch (zm) {
			case "a" : x--;
			case "d" : x++;
			case "w" : y++;
			case "s" : y--;
		}
		if((x>MAX) || (x<MIN)) {
			x=0;
		}
		else if((y>MAX) || (y<MIN)) {
			y=0;
		}
	}
	public void attackable() {
		System.out.println("공격!!");
	}
}

class Terran implements starcraft {
	int x=r.nextInt(10);
	int y=r.nextInt(10);
	String color;
	int heart=5;

	public void movable() {
		String tm=sc.next();
		switch (tm) {
			case "j" : x--;
			case "l" : x++;
			case "i" : y++;
			case "k" : y--;
		}
		if((x>MAX) || (x<MIN)) {
			x=0;
		}
		else if((y>MAX) || (y<MIN)) {
			y=0;
		}
	}
	public void attackable() {
		System.out.println("공격!!");
	}
}

class game {
	public static void main(String ar[]) {
		zerg z=new zerg();
		Terran t=new Terran();
		System.out.println("StarCraft GAME");
		System.out.println("게임 방법");
		System.out.println("zerg와 Terran를 이동시켜 공격을 합니다.\n먼저 5개의 heart를 먼저 없애 상대방을 죽이세요.");
		System.out.println("zerg :      w");
		System.out.println("          a s d");
		System.out.println("Terran :    i");
		System.out.println("          j k l");
		System.out.println("zerg : x좌표 "+ (z.x)+", y좌표 "+(z.y));
		System.out.println("Terran : x좌표 "+ (t.x)+", y좌표 "+(t.y));
 		System.out.print("zerg : ");
		for(int i=0; i<z.heart; i++) {
			System.out.print("♥");
		}
		System.out.println();
		System.out.print("Terran : ");
		for(int i=0; i<t.heart; i++) {
			System.out.print("♥");
		}
		System.out.println();
		while((0<z.heart) || (0<t.heart)) {	
			System.out.print("zerg이동 : ");
			z.movable();
			if(((z.x==t.x-1) || (z.x==t.x+1)) && ((z.y==t.y-1) || (z.y==t.y+1))) {
				z.attackable();
				t.heart--;
				if(t.heart==0) {
					System.out.println("zeerg의 승리");
					break;
				}
				else {
					System.out.print("Terran : ");
					for(int i=0; i<t.heart; i++) {
						System.out.print("♥");
					}
					System.out.println();
				}
			}
			System.out.print("Terran이동: ");
			t.movable();
			if(((t.x==z.x-1) || (t.x==z.x+1)) && ((t.y==z.y-1) || (t.y==z.y+1))) {
				t.attackable();
				z.heart--;
				if(z.heart==0) {
					System.out.println("Terran의 승리");
					break;
				}
				else {
					System.out.print("zerg : ");
					for(int i=0; i<z.heart; i++) {
						System.out.print("♥");
					}
					System.out.println();
				}
			}
			System.out.println("zerg : x좌표 "+ (z.x)+", y좌표 "+(z.y));
			System.out.println("Terran : x좌표 "+ (t.x)+", y좌표 "+(t.y));
		}
	}
}