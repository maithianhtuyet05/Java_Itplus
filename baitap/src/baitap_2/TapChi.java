package baitap_2;

public class TapChi extends TaiLieu {
	private int sophathanh;
	private int thangphathanh;

	public TapChi() {
		super();

	}

	public TapChi(int ma, String tennxb, int sobanphathanh, int sotrang, int sophathanh, int thangphathanh) {
		super(ma, tennxb, sobanphathanh);
		this.sophathanh = sophathanh;
		this.thangphathanh = thangphathanh;
	}

	public int getSophathanh() {
		return sophathanh;
	}

	public void setSophathanh(int sophathanh) {
		this.sophathanh = sophathanh;
	}

	public int getThangphathanh() {
		return thangphathanh;
	}

	public void setThangphathanh(int thangphathanh) {
		this.thangphathanh = thangphathanh;
	}

	@Override
	public String toString() {
		return "TapChi [sophathanh=" + sophathanh + ", thangphathanh=" + thangphathanh + "]";
	}

}
