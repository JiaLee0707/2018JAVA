class Employee{
	private String name;
	private int num;

	Employee(String name, int num) {
		this.name=name;
		this.num=num;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		return("이름:"+name+" 번호:"+num);
	}
}//class Employee

class SalariedEmployee extends Employee {
	double salary;
	
	SalariedEmployee(String name, int num, double salary) {
		super(name,num);
		this.salary=salary;
	}	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary() {
		return salary;
	}
	public double computsSalary(double salary) { //salary*12
		return salary*12;
	}
	public String toString(){
		return(super.toString()+" 월급:"+salary); 
	}
}
class super_Test2 {
	public static void main(String ar[]) {
		Employee e1=new Employee("Sam", 1);
		SalariedEmployee e2=new SalariedEmployee("Tom", 2,200);
		System.out.println(e2.toString());
	}
}