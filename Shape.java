class Shape {
  //width, height
	public int width, height;

	public Shape(int width, int height) {
		this.width=width;
		this.height=height;
	}
//������ �����

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
  //getArea() �����


	public static void main(String ar[]) {
		Shape s1=new Shape(3,5);
		Shape s2=new Shape(6,2);
		s1.setWidth(9);
		s2.setHeight(10);
   //s1�� setWidth ȣ��( 9)
   //s2�� setHiehgt ȣ��(10)

	System.out.println(s1.getArea(5,10)); //�ﰢ�� ���� ���ϱ�
	System.out.println(s2.getArea(6.3, 6.9)); //�簢�� ���� ���ϱ�
	}
} 