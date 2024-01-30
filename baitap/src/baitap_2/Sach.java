package baitap_2;

public class Sach extends TaiLieu {
	private String tentacgia;
	private int sotrang;

	public Sach() {
		super();

	}

	public Sach(int ma, String tennxb, int sobanphathanh, int sotrang, String tentacgia) {
		super(ma, tennxb, sobanphathanh);
		this.sotrang = sotrang;
		this.tentacgia = tentacgia;
	}

	public String getTentacgia() {
		return tentacgia;
	}

	public void setTentacgia(String tentacgia) {
		this.tentacgia = tentacgia;
	}

	public int getSotrang() {
		return sotrang;
	}

	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}

	@Override
	public String toString() {
		return "Sach [tentacgia=" + tentacgia + ", sotrang=" + sotrang + "]";
	}

}
