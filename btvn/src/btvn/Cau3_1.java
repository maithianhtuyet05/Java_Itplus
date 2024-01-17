package btvn;

public class Cau3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1 =0;
		int s2 =1;
		System.out.println("20 số đầu tiên của dãy số fibinacci là: ");
		for(int i=1; i<= 20; ++i ) {
			System.out.print(s1 + " ");
			
			int sum=s1+s2;
			s1=s2;
			s2=sum;
		}
	}

}
