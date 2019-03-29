class Param_Test5 {
  public static void main(String args[]) {

    //명령행 매개변수로 2개 값을 받은 후
	//덧셈 결과를 출력
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);

	System.out.println(a+b);
	System.out.println("배열의 크기는 "+args.length);
  


  }
}