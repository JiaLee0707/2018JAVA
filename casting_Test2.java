class Shape {
	public void draw() {
		System.out.println("�����׸���");
	}
	public void painting() {
		System.out.println("��ĥ�ϱ�");
	}
}
class circle extends Shape {
	public void draw() {
		System.out.println("���׸���");
	}
	public void painting() {
		System.out.println("��ĥ�ϱ�");
	}
}
class casting_Test2 {
	public static void main(String ar[]) {
		Shape s=new Shape();
		s.draw(); //����ũ����
		s.painting(); //����

		circle c1=new circle();
		c1.draw(); //���׸���
		c1.painting(); //��ĥ�ϱ�

		Shape s2=c1; //��ĳ����
		s2.draw(); //���׸���
		s2.painting();
	}
}