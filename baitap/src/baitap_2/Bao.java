package baitap_2;

public class Bao extends TaiLieu {
	private int ngayphathanh;

	public Bao() {
		super();

	}

	public Bao(int ma, String tennxb, int sobanphathanh, int sotrang, int ngayphathanh) {
		super(ma, tennxb, sobanphathanh);
		this.ngayphathanh = ngayphathanh;

	}

	public int getNgayphathanh() {
		return ngayphathanh;
	}

	public void setNgayphathanh(int ngayphathanh) {
		this.ngayphathanh = ngayphathanh;
	}

	@Override
	public String toString() {
		return "Bao [ngayphathanh=" + ngayphathanh + "]";
	}

}
