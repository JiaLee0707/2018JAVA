import java.util.*;

class while_2 {
  public static void main(String ar[]) {
    Scanner sc=new Scanner(System.in);
	
	//n,m�� �Է¹޾� n~m���� ¦����, Ȧ����(�ΰ� �񱳱���)
	int n=sc.nextInt();
	int m=sc.nextInt();
	int even=0;
	int odd=0;
	int i;
	if(n<=m) {
		i=n;
		while(i<=m) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
			i++;
		}
	}
	else if(m<=n) {
		i=m;
		while(i<=n) {
			if(i%2==0) {
				even++;
			}
			else {
				odd++;
			}
			i++;
		}
	}
	System.out.println(n+"~"+m+"���� ¦���� ���� "+even+"�Դϴ�.");
	System.out.println(n+"~"+m+"���� Ȧ���� ���� "+odd+"�Դϴ�.");
  }
}