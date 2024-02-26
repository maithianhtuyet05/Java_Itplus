package baitet_1;

public class TaiLieu {
	private String Title;
	private String Id;
	private String Publisher;
	private int releaseNumber;

	public TaiLieu() {
		super();
	}

	public TaiLieu(String Title, String Id, String Publisher, int releaseNumber) {
		super();
		this.Title = Title;
		this.Id = Id;
		this.Publisher = Publisher;
		this.releaseNumber = releaseNumber;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String Title) {
		this.Title = Title;
	}

	public String getId() {
		return Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String Publisher) {
		this.Publisher = Publisher;
	}

	public String getReleaseNumber() {
		return Publisher;
	}

	public void setReleaseNumber(int releaseNumber) {
		this.releaseNumber = releaseNumber;
	}

	@Override
	public String toString() {
		return "TaiLieu [Title=" + Title + ", Id=" + Id + ", Publisher=" + Publisher + ", releaseNumber="
				+ releaseNumber + "]";
	}
}
