class array2_2_Test2 {
  public static void main(String ar[]) {

	 //C언어 방과후책 p445 12번
	 int c[][]={
		{78,48,78,98},
		{99,92,83,29},
		{29,64,83,89},
		{34,78,92,56}
	  };
	  int row[];
	  row=new int[4];
	  int column[]=new int[4];
	  int total=0;	
	  for(int i=0; i<c.length; i++) {
			for(int j=0; j<c[0].length; j++) {
				row[i]+=c[i][j];
				column[i]+=c[j][i];	
				total+=c[i][j];
			}
	  }
	  System.out.println("가로의 합 : ");
	  for(int i=0; i<c.length; i++) {
			System.out.println((i+1)+"행 "+row[i]);	
	  }
	  System.out.println("세로의 합 : ");
	  for(int i=0; i<c.length; i++) {
		  System.out.println((i+1)+"열 "+column[i]);
	  }
	  System.out.println("총합 : "+total);
 }
}