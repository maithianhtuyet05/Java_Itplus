package baitap;

public class NhanVien extends CanBo {
	private String cv;

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String ten, int tuoi, String gioitinh, String diachi, String bac) {
		super(ten, tuoi, gioitinh, diachi);
		this.cv = cv;
		// TODO Auto-generated constructor stub
	}

	public String getcv() {
		return cv;
	}

	public void setcv(String cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "NhanVien [work=" + cv + ", toString()=" + super.toString() + "]";
	};
}
