class Stu {
  //이름
  //학년
  //과목
  String name;
  String grade;
  String subject;

  public void study(String where, String sub) {
	System.out.println(where+ "에서 " + sub + "을/를 공부하다");
  }
  public void play(String who) {
	System.out.println(who + "와 놀다");
  }
}