package examifTest;

import java.util.Scanner;

public class Iftest3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = 0;
		while(c<=4) {


			int com = (int)(Math.random()*6+1);
			System.out.println(com);
			int player = scan.nextInt();
			
			if(player>=1 && player <=6) {

				if(com==player) {
					System.out.println("정답");
					c=++c;
				}else {
					System.out.println("다음기회를");
				}
			}else System.out.println("숫자범위를 벗어남");
		}
		System.out.println(c+"번 맞춤");
	}
}
