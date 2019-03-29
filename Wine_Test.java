class Wine {
	private String manufacturer;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;

	Wine(String manufacturer, String name, String country,String region, String kind, int year, int grade) {
		this.manufacturer=manufacturer;
		this.name=name;
		this.country=country;
		this.region=region;
		this.kind=kind;
		this.year=year;
		this.grade=grade;
	}
	Wine(String manufacturer, String name) {
		this.manufacturer=manufacturer;
		this.name=name;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer=manufacturer;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setCountry(String country) {
		this.country=country;
	}
	public void setRegion(String region) {
		this.region=region;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getName() {
		return name;
	}
	public String getCountry() {
		return country;
	}
	public String getRegion() {
		return region;
	}
	public String getKind() {
		return kind;
	}
	public int getYear() {
		return year;
	}
	public int getGrade() {
		return grade;
	}
}
class Wine_Test {
	public static void main(String ar[]) {
		Wine w=new Wine("mirim", "merlot", "프랑스", "보르도(Bordeaux)", "red", 2018, 000);
		System.out.println(w.getManufacturer()+" "+w.getName()+" "+w.getCountry()+" "+w.getRegion()+" "+w.getKind()+" "+w.getYear()+" "+w.getGrade());
	}
}