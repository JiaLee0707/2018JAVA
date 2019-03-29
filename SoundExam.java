interface Sound {
	public void SoundUp(int level);
	public void SoundDown(int level);
}
class Tv implements Sound {
	private int SndLevel; //����
	Tv() {} //������
	public void SoundUp(int level) {
		SndLevel+=level;
	}
	public void SoundDown(int level) {
		SndLevel-=level;

		if(SndLevel < 0) {
			SndLevel=0;
		}
	}
}
class Radio implements Sound {
	private int SndLevel; //����
	Radio() {} //������
	public void SoundUp(int level) {
		SndLevel+=level;
	}
	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel < 0) {
			SndLevel=0;
		}
	}
}
class SoundExam {
	public static void main(String ar[]) {
		Sound radio=new Radio();
		Sound tv=new Tv();	
		radio.SoundUp(5);
		tv.SoundUp(5);	
	}
}

/*interface Sound {
	public void SoundUp(int level);
	public void SoundDown(int level);
}
class Tv ��ӹް� {
	private int SndLevel; //����
	//������ �����
	//�߻�޼��� ���뱸�� (level��ŭ �ö󰡰� ��������)
	������ 0���� ������ 0���� ����
	}
	}
class Radio ��ӹް� {
	�Ȱ���
	}
	class SoundExam {
		//main
		Sound radio=new Radio();
		Sound tv=new Tv();
		radio.SoundUp(5);
		tv.SoundUp(5);
	}*/