package baitet_1;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLySach {
	private TaiLieu[] TLs;
	private Scanner scanner;
	private int INDEX = 0;

	public QuanLySach(Scanner scanner) {
		super();
		TLs = new TaiLieu[0];
		this.scanner = scanner;
	}

	public void themTaiLieu(int choice) {
		TaiLieu[] newTLs = Arrays.copyOf(TLs, TLs.length + 1);
		newTLs[INDEX] = taoTaiLieu(choice);
		TLs = newTLs;
		INDEX++;
	}

	public void hienThiDanhSach() {
		for (TaiLieu TL : TLs) {
			System.out.println(TL.toString());
		}
	}

	public void hienThiLoaiTaiLieu(int choice) {
		for (TaiLieu TL : TLs) {
			if (choice == 1) {
				if (TL instanceof Sach) {
					System.out.println(TL.toString());
				}
			} else if (choice == 2) {
				if (TL instanceof TapChi) {
					System.out.println(TL.toString());
				}
			} else {
				if (TL instanceof Bao) {
					System.out.println(TL.toString());
				}
			}
		}
	}

	public void deleteByName(String name) {
		TaiLieu[] newTLs = new TaiLieu[TLs.length - 1];
		for (int i = 0, j = 0; i < TLs.length - 1; i++, j++) {
			if (!TLs[i].getTitle().equals(name)) {
				newTLs[i] = TLs[j];
			} else {
				j++;
				newTLs[i] = TLs[j];
			}
		}
		TLs = newTLs;
		INDEX--;
	}

	public static int inputNumber(Scanner scanner) {
		int number = -1;
		do {
			try {
				number = Integer.parseInt(scanner.nextLine());
			} catch (RuntimeException e) {
				System.out.println("Sai định dạng, mời nhập lại:");
			}
		} while (number == -1);
		return number;
	}

	public TaiLieu taoTaiLieu(int choice) {
		TaiLieu TL;
		System.out.println("Nhập tên Tài liệu: ");
		String Title = scanner.nextLine();
		System.out.println("Nhập mã tài liệu: ");
		String Id = scanner.nextLine();
		System.out.println("Nhà Xuất bản: ");
		String Publisher = scanner.nextLine();
		System.out.println("Số bản phát hành: ");
		int releaseNumber = inputNumber(scanner);
		if (choice == 1) {
			System.out.println("Nhập tên Tác Giả: ");
			String Author = scanner.nextLine();
			System.out.println("Nhập số trang: ");
			int numberOfPages = inputNumber(scanner);
			TL = new Sach(Title, Id, Publisher, releaseNumber, Author, numberOfPages);
		} else if (choice == 2) {
			System.out.println("Nhập số phát hành: ");
			int issueNumber = inputNumber(scanner);
			System.out.println("Nhập tháng phát hành: ");
			int releaseMonth = inputNumber(scanner);
			TL = new TapChi(Title, Id, Publisher, releaseNumber, issueNumber, releaseMonth);
		} else {
			System.out.println("Nhập ngày phát hành: ");
			int releaseDate = inputNumber(scanner);
			TL = new Bao(Title, Id, Publisher, releaseNumber, releaseDate);
		}
		return TL;
	}

	public void traTaiLieu(String Title) {
		for (TaiLieu TL : TLs) {
			if (TL.getTitle().contains(Title)) {
				System.out.println(TL.toString());
			}
		}
	}
}
