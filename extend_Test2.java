class Animal8 {
	int leg;
	String color;
	String owner;

	public String run() {
		return "�ٴ�";
	}
}

class Rabbit extends Animal8 {
	public String run() {
		return "���ѱ��Ѷٴ�";
	}
}

class Tiger extends Animal8 {
	public String run() {
		return "��ŭ��ŭ�ٴ�";
		//System.out.println("��ŭ��ŭ�ٴ�");
	}
	public String eat() {
		return "�ȳ�";
		//System.out.println("�ȳ�");
	}
}

class extend_Test2 {
	public static void main(String ar[]) {
		Rabbit r=new Rabbit();//4, "���", "�䳢����");
		Tiger t=new Tiger();//	4, "��Ȳ����", "ȣ��������");
		r.leg=4;
		r.color="���";
		r.owner="�䳢����";
		t.leg=4;
		t.color="��Ȳ����";
		t.owner="ȣ��������";
		System.out.println(r.leg+" " +r.color+" "+r.owner+" "+t.leg+" "+t.color+" "+t.owner);
		System.out.println(t.eat());
		//������� ���ְ� ���
		//�޼��� ȣ��
	}
}