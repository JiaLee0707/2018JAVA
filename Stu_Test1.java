class Stu_Test1 {
  public static void main(String ar[]) {
	  Stu s1 = new Stu();
	  s1.name = "이지아";
	  s1.grade = "1학년";
	  s1.subject = "Java";

	  System.out.println(s1.name);
	  System.out.println(s1.grade);
	  System.out.println(s1.subject);

	  //s1.study(s1.subject);
	  s1.study("school", "english");
	  //s1.study(subject); 안됨
	  s1.play(s1.name);
  }
}