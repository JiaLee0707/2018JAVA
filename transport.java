interface movable {
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
}
class vehicle {
	int speed;
	public void setSpeed(int speed) {
		this.speed=speed;
	}
	public int getSpeed() {
		return speed;
	}
	//set/get ����
}
abstract class car extends vehicle implements movable {
	String carNum; //���ѹ�
	public car() { //������
	}
	public void speedUp(int amount) { //�޼��� �������̵�
		amount=50;
	}
	public String toString() { //��������� ��� 
		carNum="1111";
		return (speed+" "+carNum);
	}	
}
class car_1 extends car {
	public void speedDown(int amount) {
		amount=100;
	}
}
abstract class car3 extends vehicle implements movable {
	String yacht; //��Ʈ ��Ϲ�ȣ
	public car3() {//������
	}
	public void speedUp(int amount) { //�޼��� �������̵�
		amount =150;
	}
	public String toString() {//��������� ���
		yacht="2222";
		return (speed+" "+yacht);
	}
}
class car_3 extends car {
	public void speedDown(int amount) {
		amount=200;
	}
}
class transport{
	public static void main(String ar[]) {
		car_1 c=new car_1();
		System.out.println(c.toString());
	}
}