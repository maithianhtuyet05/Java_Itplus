package baitet_1;

public class TapChi extends TaiLieu {
	private int issueNumber;
	private int releaseMonth;

	public TapChi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TapChi(String Title, String Id, String Publisher, int releaseNumber, int issueNumber, int releaseMonth) {
		super(Title, Id, Publisher, releaseNumber);
		this.issueNumber = issueNumber;
		this.releaseMonth = releaseMonth;
	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public int getReleaseMonth() {
		return releaseMonth;
	}

	public void setRssueMonth(int releaseMonth) {
		this.releaseMonth = releaseMonth;
	}

	@Override
	public String toString() {
		return "TapChi [issueNumber=" + issueNumber + ", releaseMonth=" + releaseMonth + ", toString()="
				+ super.toString() + "]";
	}
}
