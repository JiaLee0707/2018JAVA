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
	//set/get 설정
}
abstract class car extends vehicle implements movable {
	String carNum; //차넘버
	public car() { //생성자
	}
	public void speedUp(int amount) { //메서드 오버라이딩
		amount=50;
	}
	public String toString() { //멤버변수들 출력 
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
	String yacht; //요트 등록번호
	public car3() {//생성자
	}
	public void speedUp(int amount) { //메서드 오버라이딩
		amount =150;
	}
	public String toString() {//멤버변수들 출력
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