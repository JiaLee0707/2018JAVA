/*1. 인터페이스를 정의하고 클래스에서 구현
interface Buyable {
  public int getPrice();
}
1) Television이 Buyable을 구현한다.
2) Television은 model, maker, price를 가지며 생성자도 가진다.
3) 출력
   "KV-102", "LG", 300*/

interface Buyable {
	public int getPrice();
}
class Television implements Buyable {
	String model;
	String maker;
	int price;
	
	Television(String model, String maker,int price) {
		this.model=model;
		this.maker=maker;
		this.price=price;
	}
	public void setPrice() {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		setPrice();
		return (model+" "+maker+" "+price);
	}
}

class Buyable_test {
	public static void main(String ar[]) {
		Buyable b=new Television("KV-102", "LG", 300);
		System.out.println(b.toString());
	}
}