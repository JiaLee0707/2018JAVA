class Param14 {
  public static void main(String ar[]) {
  
    int i[]=new int[10];
	int n;
	for(n=0; n<i.length; n++) {
		i[n]=Integer.parseInt(ar[n]);
	}
	int j=0,h=0;
	for(n=0; n<i.length; n++) {
		if(i[n]%2==0) {
			j++;
		}
		else {
			h++;
		}
	}
	System.out.println("¦���� ���� : "+j);
	System.out.println("Ȧ���� ���� : "+h);
  }
}