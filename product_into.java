import java.util.*;

class Product {
	String Id;
	String info;
	String maker;
	int price;
	Scanner sc=new Scanner(System.in);

	Product(String Id, String info, String maker, int price) {
		this.Id=Id;
		this.info=info;
		this.maker=maker;
		this.price=price;
	}
	public void setId(String Id) {
		this.Id=Id;
	}
	public void setInfo(String info) {
		this.info=info;
	}
	public void setMaker(String maker) {
		this.maker=maker;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getId() {
		return Id;
	}
	public String getInfo() {
		return info;
	}
	public String getMaker() {
		return maker;
	}
	public int getPrice() {
		return price;
	}

	public void show() { //���
		System.out.println("��ǰ ID : "+getId());
		System.out.println("��ǰ ���� : "+getInfo());
		System.out.println("��ǰ�� : "+getMaker());
		System.out.println("���� : "+getPrice());
	}
}
class Book extends Product {
	String title;
	String author;
	String isbn;

	Book(String Id, String info, String maker, int price, String title, String author, String isbn) {
		super(Id, info, maker, price);
		this.title=title;
		this.author=author;
		this.isbn=isbn;	
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setIsbn(String isbn) {
		this.isbn=isbn;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void show() {
		super.show();
		System.out.println("å���� : "+getTitle());
		System.out.println("����  : "+getAuthor());
		System.out.println("ISBN : "+getIsbn());
	}
}
class music extends Product {
	String titlesong;
	String singer;

	music(String Id, String info, String maker, int price, String titlesong, String singer) {
		super(Id, info, maker, price);
		this.titlesong=titlesong;
		this.singer=singer;	
	}
	public void setTitlesong(String titlesong) {
		this.titlesong=titlesong;
	}
	public void setSinger(String singer) {
		this.singer=singer;
	}
	public String getTitlesong() {
		return titlesong;
	}
	public String getSinger() {
		return singer;
	}

	public void show() {
		super.show();
		System.out.println("�뷡 : "+getSinger());
		System.out.println("���� : "+getTitlesong());
	}
}

class product_into {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Product p[]=new Product[10];
		String Id,info,maker,title,author,isbn,titlesong,singer;
		int price;
		int count=0; //�����һ�ǰ ����
		while(true) {
			System.out.print("==��ǰ�߰�<1>, ��ǰ��ȸ<2>, ������<3>>>");
			int num=sc.nextInt();
			if(num==1) {
				System.out.print("��ǰ���� å<1>, ����CD<2>, ȸȭå<3>>>");
				int num2=sc.nextInt();
				switch(num2) {
					case 1:
						System.out.print("��ǰID>>");
						Id=sc.next();
						System.out.print("��ǰ����>>");
						info=sc.next();
						System.out.print("������>>");
						maker=sc.next();
						System.out.print("����>>");
						price=sc.nextInt();
						System.out.print("å����>>");
						title=sc.next();
						System.out.print("����>>");
						author=sc.next();
						System.out.print("ISBN>>");
						isbn=sc.next();
						p[count]=new Book(Id, info, maker, price, title, author, isbn);
						count++;
						break;
					case 2:
						System.out.print("��ǰID>>");
						Id=sc.next();
						System.out.print("��ǰ����>>");
						info=sc.next();
						System.out.print("������>>");
						maker=sc.next();
						System.out.print("����>>");
						price=sc.nextInt();
						System.out.print("�뷡Ÿ��Ʋ>>");
						titlesong=sc.next();
						System.out.print("����>>");
						singer=sc.next();
						p[count]=new music(Id, info, maker, price, titlesong, singer);
						count++;
					case 3:break;
				}
			}
			else if(num==2) {
					for(int i=0; i<count; i++) {
						p[i].show();
					}
			}
		}




	}
}