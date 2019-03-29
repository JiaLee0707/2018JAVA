import java.util.*;

class ArrayList_Test1 {
	public static void main(String ar[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2, "strawberry"); //2번째 자리에 넣기
		//mango, melon, grape, null
		//list.add(3);//String타입이랑 인트타입 안됨

		System.out.println(list.get(3)); //인덱스 번호

		list.remove(2); //strawberry 삭제

		System.out.println(list.size()); //크기

		System.out.println(list.indexOf("mango")); //인덱스 위치

		list.clear();

		//System.out.println(list);
		/*for(String fruit: list) {    //frulit은 변수라 이름 바꿔도 됨
			System.out.println(fruit);

		}//for-each 문*/

		Iterator<String> it=list.iterator(); //객체생성
		while(it.hasNext()) { //다음 데이터가 있으면
			String s=it.next(); //데이터를 s에 대입
			System.out.print(s+"\t"); 
		}

	}
}