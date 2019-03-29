class LogicalOperator {
  public static void main(String ar[]) {
     System.out.println('a'>'b'); //a:97 A:65 b:98 B:66 f
       System.out.println(3>=2); //t
         System.out.println(-1<0); //t
	   System.out.println(3.45<=2); //f
	     System.out.println(3==2); //f
	       System.out.println(3!=2); //t
		 System.out.println(!(3!=2)); //f
		   System.out.println((3>2)&&(3>4)); //f
		     System.out.println((3!=2)||(-1>0)); //t
		       System.out.println((3!=2)^(-1>0)); //t
}
}