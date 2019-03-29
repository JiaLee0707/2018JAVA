class vacation_homework4_3 {
  public static void main(String ar[]) {

	  //1+(1+2)+(1+2+3)...(1+2+3+..+10)ÀÇ °á°ú
	  int n=1,total=0,rtotal=0;
	  while(n<=10) {
		  total+=n;
		  rtotal+=total;
		  n++;
	  }
	  for(int i=1; i<=10; i++) {
		  for(int j=1; j<=i; j++) {
			  if(j<=i) {
				  if(!(j==10)) {
					  System.out.print(j+"+");
				  }
				  else {
					  System.out.print(j);
			      }
			  }
		  }
	  }
	  System.out.println("="+rtotal);
	  






















	  /*int n = 1;
	  int total = 0;
	  int rtotal = 0;

	  while (n<=10)
	  {
		  total = total + n;
		  rtotal = rtotal + total;
		  n +=1;
	  }
	  System.out.println(rtotal);*/
  }
}