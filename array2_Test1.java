import java.util.*;

class array2_Test1 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);

	int a[][];
	a=new int[2][3];
	int b=sc.nextInt();
	  for(int j=0; j<a.length; j++) {
			for(int i=0; i<a[j].length; i++) {
					a[j][i]=b;
					System.out.print(a[j][i]);
			}
			System.out.println("");
	  }
 }
}