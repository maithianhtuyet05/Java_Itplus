package baitap;

public class KySu extends CanBo {
	private String nganh;

	public KySu() {
		super();

	}

	public KySu(String ten, int tuoi, String gioitinh, String diachi, String bac) {
		super(ten, tuoi, gioitinh, diachi);
		this.nganh = nganh;

	}

	public String getnganh() {
		return nganh;
	}

	public void setSpecialTraning(String nganh) {
		this.nganh = nganh;
	}

	@Override
	public String toString() {
		return "KySu [specialTraning=" + nganh + ", toString()=" + super.toString() + "]";
	}
}
