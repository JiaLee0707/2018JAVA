import java.util.*;

class arithmetic {
	public int Add(int x, int y) {
		int sum=x+y;
		return sum;
	}
	public int Sub(int x, int y) {
		int subtraction=x-y;
		return subtraction;
	}
	public int Mul(int x, int y) {
		int multiplication=x*y;
		return multiplication;
	}
	public int Div(int x, int y) {
		int division=x/y;
		return division;
	}

	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		arithmetic a1=new arithmetic();
		System.out.println("연산할 값을 입력하세요");
		System.out.print("a : ");
		int a=sc.nextInt();
		System.out.print("b : ");
		int b=sc.nextInt();
		
		System.out.println(a1.Add(a, b));
		System.out.println(a1.Sub(a, b));
		System.out.println(a1.Mul(a, b));
		System.out.println(a1.Div(a, b));
	}
}