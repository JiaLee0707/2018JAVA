class Song{
	public String title, artist, album;
	public String composer[]=new String[3];
	public int year, track;

	public Song(String title, String artist, String album, String composer1, String composer2, String composer3, int year, int track) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer[0]=composer1;
		this.composer[1]=composer2;
		this.composer[2]=composer3;
		this.year=year;
		this.track=track;
	}

	public void show() {
		System.out.println("�뷡 "+title);
		System.out.println("���� "+artist);
		System.out.println("�ٹ� "+album);
		System.out.print("�۰ ");
		for(int i=0; i<composer.length; i++) {
			System.out.print(composer[i]+" ");
		}
		System.out.println("");
		System.out.println("���� "+year);
		System.out.println("�ٹ� ��ȣ "+track);
	}

	public static void main(String ar[]) {
		Song s1=new Song("Dancing Queen", "ABBA", "The Albumls", "Benny Andersson", "Bjorn Ulvaeus", "Stig Anderson", 2008, 4);
		s1.show();
	}
}