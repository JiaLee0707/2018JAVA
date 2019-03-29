class Wine {
	private String manufacturer, name, country, region, kind;
	private int year, grade;

	private Wine() {}

	private Wine(String manufacturer, String name) {
		this.manufacturer=manufacturer;
		this.name=name;
	}
	public static void main(String ar[]) {
		Wine w1=new Wine();
		Wine w2=new Wine("MirimShcool", "mirim");
		System.out.println(w2.manufacturer+" "+w2.name);
	}
}