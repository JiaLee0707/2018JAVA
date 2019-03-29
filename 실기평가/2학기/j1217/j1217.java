import java.util.*;

class Product {
	private String name;
	private int price;
	private int count;
	
	//설정자 set/get
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price*count;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public int getCount() {
		return count;
	}
	
	Product() {}

	public void pr() {
		System.out.println("이름 : "+name+" 가격 : "+getPrice()); 
	}
}

class DiscountProduct extends Product {
	int discount;
	//DiscountProudct(){}

	public int getPrice(int price) {
		return (price*(discount/100));
	}
	public void pr() {
		System.out.println("이름 : "+getName()+" 가격 : "+this.getPrice()); 
	}
}

class j1217 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		DiscountProduct d=new DiscountProduct();
		System.out.print("입력 : ");
		p.setName(sc.next());
		p.setPrice(sc.nextInt());
		p.setCount(sc.nextInt());
		p.pr();
		System.out.println("");
		System.out.print("입력 : ");
		d.setName(sc.next());
		d.setPrice(sc.nextInt());
		d.setCount(sc.nextInt());
		d.getPrice(p.getPrice());
		d.pr();
		
	}
}