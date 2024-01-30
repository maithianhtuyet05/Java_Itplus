package baitap;

public class CongNhan extends CanBo {
	private String bac;

	public CongNhan() {
		super();

	}

	public CongNhan(String ten, int tuoi, String gioitinh, String diachi, String bac) {
		super(ten, tuoi, gioitinh, diachi);
		this.bac = bac;

	}

	public String getbac() {
		return bac;
	}

	public void setLevel(String bac) {
		this.bac = bac;
	}

	@Override
	public String toString() {
		return "CongNhan [level=" + bac + ", toString()=" + super.toString() + "]";
	}
}
