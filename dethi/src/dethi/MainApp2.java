package dethi;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  /**
       * 2 viet chuong trinh nhap so nguyen duong n, thong baora manhinh n la so chan hay so le
       * 
       */
		int n;
		System.out.println("nhap n");
		n =sc.nextInt();
		if(n % 2 == 0) {
			System.out.println(n + "so chan");
		}else {
			System.out.println(n + "so le");
			
		}
		//S = 1 + 1/2 + ... + 1/n;
		double tong = 0;
		for(int i = 1; i <= n; i++)  {
			tong += (double)1/i;
		}
		System.out.println("Tong: " + tong);
	}

}
