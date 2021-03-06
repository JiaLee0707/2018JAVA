//간단한 그래픽 편집기
import java.util.*;

abstract class DObject {
	abstract public void draw();
}
class Figure extends DObject {
	String type; //circle, line, rect
	public void draw() {
		switch(type) {
			case "Circle":System.out.println("Circle"); break;
			case "Line":System.out.println("Line"); break;
			case "Rect":System.out.println(type); break;
		}
	}
}
class Menu {
	Scanner sc=new Scanner(System.in);
	//Figue 객체배열 10개 만들어
	Figure f[]=new Figure[10];
	Menu() {
		for(int i=0; i<f.length; i++) {
			f[i]=new Figure();
		}
	}
	public void Insert(int i) { //0 //1
		System.out.print("도형종류 Line(1), Rect(2), Circle(3)>> ");
		int number=sc.nextInt();
		switch(number) {
			case 1 : f[i].type="Line"; break;
			case 2 : f[i].type="Rect"; break;
			case 3 : f[i].type="Circle"; break;
			default : System.out.println("잘못입력하셨습니다.");
		}
	}
	public void delete() {
		System.out.println("삭제하실 도형의 위치는? >> ");
		int n=sc.nextInt();			
		f[n-1].type=" ";
	}
	public void View(int i) {
		for(int n=0; n<i; n++) {
			f[n].draw();
		}
	}

	public void Exit() {
		System.exit(0);//프로그램 종료
	}
}
class Shape_Test3 {
	public static void main(String ar[]) {
		int count=0;
		Menu m=new Menu();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("삽입[1]	 삭제[2]	모두보기[3]	종료[4] >> ");
			int choice=sc.nextInt();
			switch(choice)	{
				case 1: m.Insert(count);
				count++;//1
				break;
				case 2: m.delete();
				break;
				case 3: m.View(count);
				break;
				case 4: m.Exit();
			}
		}
	}
}