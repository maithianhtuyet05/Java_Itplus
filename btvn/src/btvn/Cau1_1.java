package btvn;

import java.util.Scanner;
public class Cau1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào số cần tính giai thừa: ");
		a = sc.nextInt();
		int gt =1;
		for(int i=1; i<a;i++ ) {
			gt = gt*i;
		}
		System.out.printf("%d! = %d ",a,gt);
		sc.close();
	}

}
