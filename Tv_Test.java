class Tv_Test {
	public static void main(String ar[]) {
		Tv t = new Tv();
		t.name = "»ï¼ºTV";
		t.home = "my home";
		t.kinds = "LED";
		t.size = 100;

		System.out.println(t.name);
		System.out.println(t.home);
		System.out.println(t.kinds);
		System.out.println(t.size);
	
		t.on();
		t.off();
		t.see();
	}
}