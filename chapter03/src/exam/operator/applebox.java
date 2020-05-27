package exam.operator;

import java.util.Scanner;

public class applebox {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("사과개수를 입력하세요.");
		int apple = scan.nextInt();
		System.out.println("박스당 사과개수를 입력하세요.");
		int b = scan.nextInt();
		int box = apple/b;
		int remainder = apple % b;
		System.out.println("사과 개수 " + apple);
		System.out.println(box+"박스, 나머지 " +remainder+"개");
		
				
	}
}
