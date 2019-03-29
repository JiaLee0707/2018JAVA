/*1. �������̽��� �����ϰ� Ŭ�������� ����
interface Buyable {
  public int getPrice();
}
1) Television�� Buyable�� �����Ѵ�.
2) Television�� model, maker, price�� ������ �����ڵ� ������.
3) ���
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