package baitap_2;

import java.util.Arrays;
import java.util.Scanner;

public class qltl {
	private TaiLieu[] cbs;
	private Scanner scanner;
	private int INDEX = 0;

	public qltl(Scanner scanner) {
		super();
		cbs = new TaiLieu[0];
		this.scanner = scanner;
	}

	public void themTaiLieu(int choice) {
		TaiLieu[] newCbs = Arrays.copyOf(cbs, cbs.length + 1);
		newCbs[INDEX] = themTaiLieu(choice);
		cbs = newCbs;
		INDEX++;
	}

	public void hienThiDanhSach() {
		for (TaiLieu cb : cbs) {
			if (cb != null) {
				System.out.println(cb.toString());
			}
		}
	}
}
