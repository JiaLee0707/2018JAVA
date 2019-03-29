class Car10 {
  String carname;
  String color;
  int velocity: 속도

  public void speedUp() {    : 5씩 증가
	this.velocity+=5;
  }
  public void speeddown(): 5씩 감소
	this.velocity-=5;
  }
class black extends Car10 {

}
class Car10_Test {
	public static void main(String ar[]) {
		black b=new black();
		b.carname="프론티어";
		b.color="검정";
		b.velocity="

Car10클래스를 상속받아 3톤의 무게를 실을 수 있는 검정색
프론티어 트럭을 만드시오.

출력결과: 나의 트럭은 검정색이다
           프론티어는 3톤을 실을 수 있다.