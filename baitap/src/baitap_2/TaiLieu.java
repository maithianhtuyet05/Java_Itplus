package baitap_2;

public class TaiLieu {
	private int ma;
	private String tennxb;
	private int sobanphathanh;

	public TaiLieu() {
		super();
	}

	public TaiLieu(int ma, String tennxb, int sobanphathanh) {
		super();
		this.ma = ma;
		this.tennxb = tennxb;
		this.sobanphathanh = sobanphathanh;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public String getTennxb() {
		return tennxb;
	}

	public void setTennxb(String tennxb) {
		this.tennxb = tennxb;
	}

	public int getSobanphathanh() {
		return sobanphathanh;
	}

	public void setSobanphathanh(int sobanphathanh) {
		this.sobanphathanh = sobanphathanh;
	}

	@Override
	public String toString() {
		return "TaiLieu [ma=" + ma + ", tennxb=" + tennxb + ", sobanphathanh=" + sobanphathanh + "]";
	}

}
