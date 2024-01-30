package baitap;

public class CanBo {
	private String ten;
	private int tuoi;
	private String gioitinh;
	private String diachi;

	public CanBo() {
		super();
	}

	public CanBo(String ten, int tuoi, String gioitinh, String diachi) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioitinh = gioitinh;
		this.diachi = diachi;
	}

	public String getten() {
		return ten;
	}

	public void setten(String ten) {
		this.ten = ten;
	}

	public int gettuoi() {
		return tuoi;
	}

	public void settuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getgioitinh() {
		return gioitinh;
	}

	public void setgioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getdiachi() {
		return diachi;
	}

	public void setAddress(String diachi) {
		this.diachi = diachi;
	}

	@Override
	public String toString() {
		return "CanBo [ten=" + ten + ", tuoi=" + tuoi + ", gioitinh=" + gioitinh + ", diachi=" + diachi + "]";
	}
}
