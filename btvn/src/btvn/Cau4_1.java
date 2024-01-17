package btvn;
import java.util.Scanner;

public class Cau4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sotiengui;
		int sothang;
		double laisuot;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap tien gui: ");
		sotiengui = scanner.nextDouble();
		System.out.println("Nhap thang gui: ");
		sothang = scanner.nextInt();
		System.out.println("Lai suot: ");
		laisuot = scanner.nextDouble();
		double tonglaisuot = 0;
		for(int i=1; i<=sothang;i++) {
			tonglaisuot = sotiengui *laisuot/100 *sothang;
		}
		System.out.println(tonglaisuot);
	}

}
