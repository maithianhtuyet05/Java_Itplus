package btvn;

public class Cau5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i <= 100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("HelloWorld");
			}else if(i%3 == 0) {
				System.out.println("Hello");
			}else if(i%5 == 0) {
				System.out.println("World");
			}else {
				System.out.println(i);
			}
		}
	}

}
