import java.util.*;

class num3 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

    System.out.print("���� �Է��Ͻÿ� : ");
    int n=sc.nextInt();
    int i=1;
	System.out.println(n+"��");
	while(i<=9) {
		System.out.println(n+"*"+i+"="+n*i);
		i++;	
	}
  }
}