class Phone {
	String manufacturer;
	String price;
	String Communication;
	Phone(String manufacturer, String price, String Communication) {
		this.manufacturer=manufacturer;
		this.price=price;
		this.Communication=Communication;
	}
	public String toString(){
		return "������ : "+manufacturer+"\n���� : "+price+"\n���Ÿ�� : "+Communication;
	}
}
class SmartPhone extends Phone {
	String OS;
	String version;
	String memory;
	String camera; 
	String bluetooth;
	SmartPhone(String manufacturer, String price, String Communication, String OS, String version, String memory, String camera, String bluetooth){
		super(manufacturer,price,Communication);
		this.OS=OS;
		this.version=version;
		this.memory=memory;
		this.camera=camera; 
		this.bluetooth=bluetooth;
		System.out.println("�ü�� Ÿ�� : "+OS+"\n�ü�� ���� : "+version+"\n���� �޸� ũ�� : "+memory+"\nī�޶� ���� ���� : "+camera+"\n������� ���� ���� : "+bluetooth);
	}
}
class SmartPhone_Test {
	public static void main(String ar[]) {
		Phone p=new Phone("apple", "100", "sk");
		SmartPhone s=new SmartPhone("apple", "100", "sk","ios","����", "���� �޸�", "camera Yes", "bluetooth Yes");
		System.out.println(p.toString());

	}
}
