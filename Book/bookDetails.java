package Book;

public class bookDetails {

	private int id;
	private String name;
	private String author;
	private int price;

	public bookDetails (int id, String name, String author, int price){
		this.id=id;
		this.name=name;
		this.author=author;
		this.price=price;
	}

	@Override
	public String toString() {
		return "id: "+id+"\nName: "+name+"\nAuthor: "+author+"\nPrice: "+price+"\n";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice(){
		return price;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setAuthor(String name) {
		this.author=name;
	}

	public void setPrice(int price) {
		this.price=price;
	}

}


