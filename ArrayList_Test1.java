import java.util.*;

class ArrayList_Test1 {
	public static void main(String ar[]) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("apple");
		list.add("mango");
		list.add("melon");
		list.add("grape");
		list.add(null);
		list.add(2, "strawberry"); //2��° �ڸ��� �ֱ�
		//mango, melon, grape, null
		//list.add(3);//StringŸ���̶� ��ƮŸ�� �ȵ�

		System.out.println(list.get(3)); //�ε��� ��ȣ

		list.remove(2); //strawberry ����

		System.out.println(list.size()); //ũ��

		System.out.println(list.indexOf("mango")); //�ε��� ��ġ

		list.clear();

		//System.out.println(list);
		/*for(String fruit: list) {    //frulit�� ������ �̸� �ٲ㵵 ��
			System.out.println(fruit);

		}//for-each ��*/

		Iterator<String> it=list.iterator(); //��ü����
		while(it.hasNext()) { //���� �����Ͱ� ������
			String s=it.next(); //�����͸� s�� ����
			System.out.print(s+"\t"); 
		}

	}
}