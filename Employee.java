class Employee {
	//setHiredate(), getSalary() 만들기
	private String name, day;
	private int Salary;
	public Employee(String name, int Salary, String day) {
		this.name=name;
		this.Salary=Salary;
		this.day=day;
	}
	public Employee(String name, String day) {
		this.name=name;
		this.day=day;
	}
	public Employee(int Salary, String day) {
		this.Salary=Salary;
		this.day=day;
	}
	public Employee(String name, int Salary) {
		this.name=name;
		this.Salary=Salary;
	}

	public void setHiredate(String a) {
		System.out.println(a);
	}
	public int getSalary() {
		return Salary;
	}


	public static void main(String ar[]) {
		Employee e1=new Employee("Mike", 100,"2018-03-01");
		Employee e2=new Employee("Alice", "2017-03-02");
		Employee e3=new Employee(300, "2016-05-03");
		Employee e4=new Employee("Tomas", 500);
		
		e2.setHiredate(e2.day);
		System.out.println(e4.getSalary());
		//e2의 setHiredate()호출 2015-05-03
		//e4의 getSalary() 호출
	}
}