class Shape {
  //width, height
	public int width, height;

	public Shape(int width, int height) {
		this.width=width;
		this.height=height;
	}
//생성자 만들기

	public void setWidth(int a) {
		System.out.println(a);
	}
	public void setHeight(int b) {
		System.out.println(b);
	}
	public float getArea(int x, int y) {
		return (float)(x*y/2);
	}
	public double getArea(double x, double y) {
		return x*y;
	}
  //setWidth()
  //setHeight()
  //getArea() 만들기


	public static void main(String ar[]) {
		Shape s1=new Shape(3,5);
		Shape s2=new Shape(6,2);
		s1.setWidth(9);
		s2.setHeight(10);
   //s1의 setWidth 호출( 9)
   //s2의 setHiehgt 호출(10)

	System.out.println(s1.getArea(5,10)); //삼각형 넓이 구하기
	System.out.println(s2.getArea(6.3, 6.9)); //사각형 넓이 구하기
	}
} 