class Book {
//title, author, publish(출판사), price
	public String title, author, publish;
	public int price;

	public Book(String title, String author, String publish, int price) {
		this.title=title;
		this.author=author;
		this.publish=publish;
		this.price=price;
	}
	public Book(String title, String publish, int price) {
		this.title=title;
		this.publish=publish;
		this.price=price;
	}
	public Book(String title, int price) {
		this.title=title;
		this.price=price;
	}
	public Book() {}
//생성자

	public String sell(String s) {
		return (s+"를 사다");
	}
	public String buy(String b) {
		return (b+"를 사다");
	}
//sell(), buy() 4번 방법으로 

	public void setAuthor(String a) {
		System.out.println(a);
	}
	public void setTitle(String x) {
		System.out.println(x);
	}
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
//setAuhor()
//setTitle()
//getAuthor()
//getTitle()

	public static void main(String ar[]) {
		Book b1=new Book("A","a","aa",100);
		Book b2=new Book("B","bb",200);
		Book b3=new Book("C",300);
		Book b4=new Book();
		b4.sell("Book");
		b4.buy("Book");

		b4.setAuthor(b4.author);
		b4.setTitle(b4.title);
		System.out.println(b4.getAuthor());
		System.out.println(b4.getTitle());
   }
   }
