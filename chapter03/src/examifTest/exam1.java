package examifTest;

import java.util.Scanner;

public class exam1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("성적을 입력하세요.");
		int s = scan.nextInt();
		int sc = s/10;
		switch(sc) {
		case 9:
			System.out.println("A+");
		break;
		case 8:
			System.out.println("B+");
			break;
		default:
			System.out.println("기본");
	}
}
}
