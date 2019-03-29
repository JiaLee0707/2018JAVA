class vacation_homework4_6 {
  public static void main(String ar[]) {

	//두 개의 주사위를 던졌을 때 눈의 합이 2가 되는 모든 경우의 수
	int count=0;
	for(int i=1; i<=6; i++) {
		for(int j=1; j<=6; j++) {
			if((i+j)==2) {
				System.out.println(i+"+"+j+"="+(i+j)
					);
				count++;
			}
		}
	}
	System.out.println("눈의 합이 2가 되는 경우의 수는 "+count);
  }
}