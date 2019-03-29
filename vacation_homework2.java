import java.util.*;

class vacation_homework2 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);

		//È­¾¾¸¦ ¼·¾¾·Î º¯È¯ÇÏ´Â ÄÚµå
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
		float h=sc.nextFloat();
		double s=(h-32)/1.8;
		System.out.println(h+"(È­¾¾)="+s+"(¼·¾¾)");
	}
}