class Person10 {
	private String name;
	private String addr;
	private String tel;
	
	public Person10(String name) {
		this.name=name;
	}
	public Person10(String name, String addr, String tel) {
		this.name=name;
		this.addr=addr;
		this.tel=tel;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getAddr() {
		return addr;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}
	public String getTel() {
		return tel;
	}
	public String toString() {
		return("이름:"+name+" 주소:"+addr+" 번호:"+tel);
	}
}
class Customer extends Person10 {
	String number;//고객번호
	int mileage; //마일리지
	
	public Customer (String name, String addr, String tel, String number, int mileage) {   //생성자
		
		super(name, addr, tel);

		//this.name=name;
		//this.addr=addr;
		//this.tel=tel;
		this.number=number;
		this.mileage=mileage;
	}
	public String toString() {
		return (super.toString()+" [고객번호]:"+number+" [마일리지]:"+mileage);
	}
}

class super_Test {
	public static void main(String ar[]) {
		Customer c=new Customer("Tom", "101-412", "011", "100", 9);
		System.out.println(c.toString());
	}
}