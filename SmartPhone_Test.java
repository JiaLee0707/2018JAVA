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
		return "제조사 : "+manufacturer+"\n가격 : "+price+"\n통신타입 : "+Communication;
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
		System.out.println("운영체제 타입 : "+OS+"\n운영체제 버전 : "+version+"\n내부 메모리 크기 : "+memory+"\n카메라 장착 여부 : "+camera+"\n블루투스 지원 여부 : "+bluetooth);
	}
}
class SmartPhone_Test {
	public static void main(String ar[]) {
		Phone p=new Phone("apple", "100", "sk");
		SmartPhone s=new SmartPhone("apple", "100", "sk","ios","버전", "내부 메모리", "camera Yes", "bluetooth Yes");
		System.out.println(p.toString());

	}
}
