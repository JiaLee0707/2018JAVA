interface Sound {
	public void SoundUp(int level);
	public void SoundDown(int level);
}
class Tv implements Sound {
	private int SndLevel; //볼륨
	Tv() {} //생성자
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
	private int SndLevel; //볼륨
	Radio() {} //생성자
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
class Tv 상속받고 {
	private int SndLevel; //볼륨
	//생성자 만들고
	//추상메서드 몸통구현 (level만큼 올라가고 내려가고)
	볼륨이 0보다 작으면 0으로 세팅
	}
	}
class Radio 상속받고 {
	똑같이
	}
	class SoundExam {
		//main
		Sound radio=new Radio();
		Sound tv=new Tv();
		radio.SoundUp(5);
		tv.SoundUp(5);
	}*/