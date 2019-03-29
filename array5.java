class array5 {
  public static void main(String ar[]) {

  int a[]=new int[2];
  for(int i=1; i<=30; i++) {
	  if(i%2==0) {
		  a[0]+=i;
	  }
	  else {
		  a[1]+=i;
	  }
  }
  System.out.println("Â¦¼öÀÇ ÇÕ : "+a[0]);
  System.out.println("È¦¼öÀÇ ÇÕ : "+a[1]);
  }
}