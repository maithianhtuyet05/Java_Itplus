package baitet_1;

public class Sach extends TaiLieu {
	private String Author;
	private int numberOfPages;

	public Sach() {
		super();
	}

	public Sach(String Title, String Id, String Publisher, int releaseNumber, String Author, int numberOfPages) {
		super(Title, Id, Publisher, releaseNumber);
		this.Author = Author;
		this.numberOfPages = numberOfPages;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String Author) {
		this.Author = Author;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	@Override
	public String toString() {
		return "Sach [Author=" + Author + ", numberOfPages=" + numberOfPages + ", toString()=" + super.toString() + "]";
	}

}
