class Car_1 {
	private String brand, owner, company;
	private int price;

	public Car_1(String brand, String owner, String company, int price) {
		this.brand=brand;
		this.owner=owner;
		this.company=company;
		this.price=price;
	}
	public Car_1(String owner, String company, int price) {
		this.owner=owner;
		this.company=company;
		this.price=price;
	}
	public Car_1(String owner, int price) {
		this.owner=owner;
		this.price=price;
	}

	public String start(String a) {
		return a;
	}
	public String stop(String b) {
		return b;
	}
	//�޼��� start(), stop() 4��������� �����

	public static void main(String ar[]) {
		Car_1 c1=new Car_1("sonata","mike","hyundae",210);
		Car_1 c2=new Car_1("Alice","kia",300);
		Car_1 c3=new Car_1("Tom",350);
		Car_1 c4=new Car_1("Benz", "Tomas","mk",500);
		
		System.out.println(c3.brand+"\n"+c3.owner+"\n"+ c3.company+"\n"+c3.price);
		System.out.println(c4.start("����ϴ�"));
		System.out.println(c4.stop("���ߴ�"));
		//c3�� ��������� ���

		//c4�� �޼��� ȣ��
		}
		}