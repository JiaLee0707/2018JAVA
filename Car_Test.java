class Car_Test {
	public static void main(String ar[]) {
		Car c = new Car();
		c.kinds = "bus";
		c.color = "blue";
		c.emphyseams = "I don't no";
		c.owner = "Songi";
		c.wheels = 4;

		System.out.println(c.kinds);
		System.out.println(c.color);
		System.out.println(c.emphyseams);
		System.out.println(c.owner);
		System.out.println(c.wheels);		

		c.run();
		c.drive();
		c.parking();
		c.uturn();
	}
}