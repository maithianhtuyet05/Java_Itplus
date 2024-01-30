package baitap_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		qltl qltl = new qltl(scanner);
		int choice;
		do {
			System.out.println("MENU");
			System.out.println("1. Thêm mới tài liệu");
			System.out.println("2. Xoá tài liệu theo mã tài liệu");
			System.out.println("3. Hiện thị thông tin về tài liệu");
			System.out.println("4. Tìm kiếm tài liệu theo loại");
			System.out.println("0. Thoát");
			System.out.println("Nhập lựa chọn của bạn: ");
			choice = Integer.parseInt(scanner.nextLine());
			switch (choice) {
			case 1:
				System.out.println("Tìm kiếm tài liệu theo loại: ");
				System.out.println("1. Sách");
				System.out.println("2. Tạp Chí");
				System.out.println("3. Báo");
				System.out.println("Nhập lựa chọn của bạn: ");
				int choice1 = Integer.parseInt(scanner.nextLine());
				qltl.themTaiLieu(choice1);
				break;
			case 2:
				System.out.println("c2");
				break;

			}
		} while (choice != 0);
	}
}
