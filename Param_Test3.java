class Param_Test3 {
  public static void main(String ar[]) {

    //5�� ���� �Է¹޾Ƽ� selection sort �ϱ� ��������
    int a[]=new int[5];
    a[0]=Integer.parseInt(ar[0]);
    a[1]=Integer.parseInt(ar[1]);
    a[2]=Integer.parseInt(ar[2]);
    a[3]=Integer.parseInt(ar[3]);
    a[4]=Integer.parseInt(ar[4]);

    int x,i,j;
    for(i=0; i<a.length; i++) {
		for(j=i+1; j<a.length; j++) {
			if(a[i]>a[j]) {
				x=a[i];
				a[i]=a[j];
				a[j]=x;
			}
		}
	}
	for(i=0; i<a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println("");
 }
}