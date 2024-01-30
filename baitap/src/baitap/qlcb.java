package baitap;

import java.util.Arrays;
import java.util.Scanner;

public class qlcb {
	private CanBo[] cbs;
	private Scanner scanner;
	private int INDEX = 0;

	public qlcb(Scanner scanner) {
		super();
		cbs = new CanBo[0];
		this.scanner = scanner;
	}

	public void themCanBo(int choice) {
		CanBo[] newCbs = Arrays.copyOf(cbs, cbs.length + 1);
		newCbs[INDEX] = taoCanBo(choice);
		cbs = newCbs;
		INDEX++;
	}

	public void hienThiDanhSach() {
		for (CanBo cb : cbs) {
			if (cb != null) {
				System.out.println(cb.toString());
			}
		}
	}

	public CanBo taoCanBo(int choice) {
		CanBo cb;
		System.out.println("Nhập tên: ");
		String name = scanner.nextLine();
		System.out.println("Nhập tuổi: ");
		int age = Integer.parseInt(scanner.nextLine());
		String gender = choiceGender();
		System.out.println("Nhập địa chỉ: ");
		String address = scanner.nextLine();
		if (choice == 1) {
			System.out.println("Nhập ngành đào tạo: ");
			String special = scanner.nextLine();
			cb = new KySu(name, age, gender, address, special);
		} else if (choice == 2) {
			System.out.println("Nhập bậc: ");
			String level = scanner.nextLine();
			cb = new CongNhan(name, age, gender, address, level);
		} else {
			System.out.println("Nhập công việc: ");
			String work = scanner.nextLine();
			cb = new NhanVien(name, age, gender, address, work);
		}
		return cb;
	}

	private String choiceGender() {
		System.out.println("Chọn giới tính: ");
		System.out.println("1. Nam");
		System.out.println("2. Nữ");
		System.out.println("3. Khác");
		System.out.println("Nhập lựa chọn: ");
		int choiceGender = Integer.parseInt(scanner.nextLine());
		if (choiceGender == 1) {
			return "Nam";
		} else if (choiceGender == 2) {
			return "Nữ";
		} else {
			return "Khác";
		}
	}

}
