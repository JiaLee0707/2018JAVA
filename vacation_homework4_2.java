class vacation_homework4_2 {
  public static void main(String ar[]) {

    //1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합
    int total=0;
    for(int i=1; i<=20; i++) {
		if(!((i%2==0)&&(i%3==0))) {
			total+=i;
		}
    }
    System.out.println("1~20 2,3의 배수가 아닌 수의 총합 : "+total);
  }
}