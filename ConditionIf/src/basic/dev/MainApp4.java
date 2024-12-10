package basic.dev;

import java.util.Scanner;

public class MainApp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap mot so tu nhien n: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i < n) {
			if(i % 3 == 0) {
				sum += i;
				
			}
			i++;
		}
		
		System.out.println("tong cac so chia het cho 3 va be hon " + n + " la:" + sum);
	}

}
