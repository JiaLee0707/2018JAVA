import java.util.*;

class Student_addr {
	private String name;
	private int age;
	private String number;
	private String skill;
	private String address;

	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setNumber(String number) {
		this.number=number;
	}
	public void setSkill(String skill) {
		this.skill=skill;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getNumber() {
		return number;
	}
	public String getSkill() {
		return skill;
	}
	public String getAddress() {
		return address;
	}

	public void pr() {
		System.out.println("===================");
		System.out.println("�̸� : "+name+"\n���� : "+age+"\n��ȭ��ȣ : "+number+"\n��Ư�� : "+skill+"\n�ּ� : "+address);
	}
}
class studnet_addr_test {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("�Է��ο�:>>");
		int n=sc.nextInt();
		System.out.println("==�л������Է�==");
		System.out.println("================");
		
		Student_addr s[]=new Student_addr[n];

		for(int i=0; i<n; i++) {
			s[i]=new Student_addr();
			/*s[i]=new Studnet_addr();
			String s1=*/
			System.out.print("�̸� : ");
			s[i].setName(sc.next());
			System.out.print("���� : ");
			s[i].setAge(sc.nextInt());
			System.out.print("��ȭ��ȣ : ");
			s[i].setNumber(sc.next());
			System.out.print("��Ư�� : ");
			s[i].setSkill(sc.next());
			System.out.print("�ּ� : ");
			s[i].setAddress(sc.next());
		}
		for(int i=0; i<n; i++) {
			s[i].pr();
		}
		System.out.println("\n");
	}
}